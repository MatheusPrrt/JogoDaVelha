package jogodavelha;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class JogoDaVelha extends JFrame{
    JButton[] bt = new JButton[9];
    JLabel placar = new JLabel("placar");
    JLabel px = new JLabel("X 0");
    JLabel po = new JLabel("O 0");
    JButton novo = new JButton("Novo Jogo");
    JButton zerar = new JButton("Zerar Placar");
    int PX = 0;
    int PO = 0;
    boolean xo = false;
    boolean[] click = new boolean[9];
    public JogoDaVelha(){
        setVisible(true);
        setTitle("Jogo Da Velha");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(250,100,700,500); 
        add(placar);
        add(px);
        add(po);
        add(novo);
        add(zerar);
        placar.setBounds(475,50,100,30);
        px.setBounds(450,75,100,30);
        po.setBounds(500,75,100,30);
        novo.setBounds(425,100,140,30);
        zerar.setBounds(425,150,140,30);
        novo.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                limpar();
                
            }             
        });
        zerar.addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                PO = 0;
                PX = 0;
                atualizar();
                
            }             
        });
        
        int count = 0;
        for (int i = 0; i < 3; i++){
             for (int j = 0; j < 3; j++){
                 bt[count] = new JButton();
                 add(bt [count]);
                 bt[count].setBounds((100 * i) + 50, (100 * j) + 50, 95 , 95);
                 bt[count].setFont(new Font("Arial", Font.BOLD,40));
                 count++;
             }
        }
        for (int i = 0; i < 9; i++){
            click[i] = false;
        }
        bt[0].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(click[0] == false){
                     click[0] = true;
                     mudar(bt[0]);
                }
            }             
        });
        bt[1].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(click[1] == false){
                     click[1] = true;
                     mudar(bt[1]);
                }
            }             
        });
        bt[2].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(click[2] == false){
                     click[2] = true;
                     mudar(bt[2]);
                }
            }             
        });
        bt[3].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(click[3] == false){
                     click[3] = true;
                     mudar(bt[3]);
                }
            }             
        });
        bt[4].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(click[4] == false){
                     click[4] = true;
                     mudar(bt[4]);
                }
            }             
        });
        bt[5].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(click[5] == false){
                     click[5] = true;
                     mudar(bt[5]);
                }
            }             
        });
        bt[6].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(click[6] == false){
                     click[6] = true;
                     mudar(bt[6]);
                }
            }             
        });
        bt[7].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(click[7] == false){
                     click[7] = true;
                     mudar(bt[7]);
                }
            }             
        });
        bt[8].addActionListener(new java.awt.event.ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(click[8] == false){
                     click[8] = true;
                     mudar(bt[8]);
                }
            }             
        });
    }
    public void mudar(JButton btn){
        if(xo){
            btn.setText("O");
            xo = false;
        }else{
             btn.setText("X");
            xo = true;
        }
        ganhou();
    }       
    
    public void atualizar(){
     px.setText("x "+ PX);
     po.setText("o "+ PO);
    }
    public void ganhou(){
        int count = 0;
        for (int i = 0; i < 9; i++){
            if(click[i] == true){
                count++;
            }
        }
        if ((bt[0].getText() == "X" && bt[1].getText() == "X" && bt[2].getText() == "X")
                 ||(bt[3].getText() == "X" && bt[4].getText() == "X" && bt[5].getText() == "X")
                 ||(bt[6].getText() == "X" && bt[7].getText() == "X" && bt[8].getText() == "X")
                 ||(bt[0].getText() == "X" && bt[3].getText() == "X" && bt[6].getText() == "X")
                 ||(bt[1].getText() == "X" && bt[4].getText() == "X" && bt[7].getText() == "X")
                 ||(bt[2].getText() == "X" && bt[5].getText() == "X" && bt[8].getText() == "X")
                 ||(bt[0].getText() == "X" && bt[4].getText() == "X" && bt[8].getText() == "X") 
                 ||(bt[6].getText() == "X" && bt[4].getText() == "X" && bt[2].getText() == "X")) {
            JOptionPane.showMessageDialog(null, "X Ganhou!");
            PX++;
            atualizar();            
        }else if ((bt[0].getText() == "O" && bt[1].getText() == "O" && bt[2].getText() == "O")
                 ||(bt[3].getText() == "O" && bt[4].getText() == "O" && bt[5].getText() == "O")
                 ||(bt[6].getText() == "O" && bt[7].getText() == "O" && bt[8].getText() == "O")
                 ||(bt[0].getText() == "O" && bt[3].getText() == "O" && bt[6].getText() == "O")
                 ||(bt[1].getText() == "O" && bt[4].getText() == "O" && bt[7].getText() == "O")
                 ||(bt[2].getText() == "O" && bt[5].getText() == "O" && bt[8].getText() == "O")
                 ||(bt[0].getText() == "O" && bt[4].getText() == "O" && bt[8].getText() == "O") 
                 ||(bt[6].getText() == "O" && bt[4].getText() == "O" && bt[2].getText() == "O")) {
            JOptionPane.showMessageDialog(null, "O Ganhou!");
            PO++;
            atualizar();
        }else if(count == 9){
         JOptionPane.showMessageDialog(null, "Empate!");
         PO--;
         PX--;
         atualizar();
         limpar();
        }
    }
    public void limpar(){
         for (int i = 0; i < 9; i++){
             bt[i].setText("");
             click[i] = false;               
}
        }
    
    public static void main(String[] args) {
        new JogoDaVelha();
    }
}