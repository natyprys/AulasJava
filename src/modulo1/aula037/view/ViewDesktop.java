package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//javax- interface grafica 
//swing para desktop
//extends JFrame herda de uma tela

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import dao.CategoriaDao;
import model.Categoria;

public class ViewDesktop extends JFrame {
        private CategoriaDao dao;
        private Container container;
        private JLabel lbNome;
        private JTextField txtNome;
        private JButton btnSalvar, btnDelete, btnUpdate; 
        private JTable table;
        private DefaultTableModel tableModel; //modelo da tabela
    
        public ViewDesktop() {
        //definindo um nome pra tela
        super("Categorias");
        
        //para tirar o padrão
        setLayout(null);
       
        inicializaComponentes();
        posicionamento();
        adicionaEventos();
        ler();

        //tamanho da tela
        setSize(800, 600);
        setLocationRelativeTo(null);
        //para ela aparecer
        setVisible(true);
    }

    
    private void inicializaComponentes(){
        dao = new CategoriaDao();

        //para ir colocando os elementos na tela
        container = getContentPane();

        lbNome =  new JLabel("Nome:");
        txtNome = new JTextField();
        btnSalvar = new JButton("Salvar");
        btnDelete = new JButton("Deletar");
        btnUpdate = new JButton("Alterar");
        table = new JTable();
        tableModel = (DefaultTableModel)table.getModel();
        tableModel.addColumn("id_categoria");
        tableModel.addColumn("Nome");
        tableModel.addColumn("Descrição");

    }

    
    private void posicionamento() {
        //posicionamento de cada coisa na tela
        lbNome.setBounds(10, 10, 50, 20);
        txtNome.setBounds(70, 10, 250, 20);        
        btnSalvar.setBounds(10, 40, 100, 20);
        table.setBounds(10, 80, 700, 300);
        btnDelete.setBounds(10, 400, 100, 20);
        btnUpdate.setBounds(115, 400, 100, 20);

        //adicionando componentes
        container.add(lbNome);
        container.add(txtNome);
        container.add(btnSalvar);
        container.add(table);
        container.add(btnDelete);
        container.add(btnUpdate);
    }

    private void adicionaEventos() {
        btnSalvar.addActionListener( new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent e) {               
               Categoria model = new Categoria();
               model.setNome(txtNome.getText());
               salvar(model);               
            }
        });

        btnDelete.addActionListener( new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent e) {               
               int id = (int)table.getValueAt(table.getSelectedRow(), 0);
               Categoria model = new Categoria();
               model.setId(id);
               delete(model);               
            }
        });


        //criando um novo objeto dentro de um metodo
        btnUpdate.addActionListener( new ActionListener(){            
            @Override
            public void actionPerformed(ActionEvent e) {               
               int id = (int)table.getValueAt(table.getSelectedRow(), 0);
               String nome = (String)table.getValueAt(table.getSelectedRow(), 1);
               Categoria model = new Categoria();
               model.setId(id);
               model.setNome(nome);
               alterar(model);               
            }   
        });
    }


    // ==================== Metodos de CRUD ===================================
    private void salvar(Categoria model){
        dao.insert(model);
        JOptionPane.showMessageDialog(container, "Categoria:"+model.getNome()+ " Salva com sucesso!" ); 
        ler();
    }

    private void ler(){
        tableModel.setRowCount(0);
        for (Categoria c : dao.read()) {
            tableModel.addRow(new Object[]{c.getId(), c.getNome(), c.getDescricao()});
        }
    }
    private void delete(Categoria model){
        dao.delete(model);
        JOptionPane.showMessageDialog(container, "Categoria de id: "+model.getId() +" Deletada com sucesso!" );        
        ler();
    }
    private void alterar(Categoria model) {
        dao.update(model);
        JOptionPane.showMessageDialog(container, "Categoria de id: "+model.getId() +" Alterada com sucesso!" );        
        ler();
    }
}


    

