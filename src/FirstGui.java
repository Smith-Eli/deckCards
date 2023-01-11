import javax.swing.JFrame;
import java.awt.event.*;  
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import java.util.concurrent.ThreadLocalRandom;


public class FirstGui{
public static void main(String s[]) {
JFrame frame = new JFrame("Card");
JPanel cardpanel = new JPanel();
JButton button = new JButton("New Card");
JButton saveToHand = new JButton("Save Card");
JPanel buttonpanel = new JPanel();
JPanel handpanel = new JPanel();
JPanel mainpanel = new JPanel();
JButton clearHand = new JButton("Clear Hand");

clearHand.setPreferredSize(new Dimension(233, 40));
saveToHand.setPreferredSize(new Dimension(233, 40));
button.setPreferredSize(new Dimension(233, 40));
frame.add(mainpanel);
mainpanel.add(buttonpanel);
mainpanel.add(cardpanel);
mainpanel.add(handpanel);
buttonpanel.add(button);
buttonpanel.add(saveToHand);
buttonpanel.add(clearHand);


frame.setSize(760,280);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);

clearHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent clearCards) {
        cardpanel.removeAll();
        handpanel.removeAll();
        handpanel.repaint();

}
});;

    
button.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent newcard) {


        cardpanel.removeAll();
        for (ActionListener al : saveToHand.getActionListeners()) {
            saveToHand.removeActionListener(al);
          }
                
        Deck deck = new Deck();
System.out.println(deck.ShowDeck());
int randomNum = ThreadLocalRandom.current().nextInt(0 - 1, 52 + 1);


Card card = new Card(randomNum);
System.out.print(card.Face() + " of " + card.Suit()); 

if (randomNum == 0){
    JLabel label = new JLabel("🃑");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 0){
            JLabel labelNew = new JLabel("🃑");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();



        

}
}});;
}

    
if (randomNum == 1){
    JLabel label = new JLabel("🃒");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));


saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 1){
            JLabel labelNew = new JLabel("🃒");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}

if (randomNum == 2){
    JLabel label = new JLabel("🃓");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

    
saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 2){
            JLabel labelNew = new JLabel("🃓");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}

    
if (randomNum == 3){
    JLabel label = new JLabel("🃔");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

    
saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 3){
            JLabel labelNew = new JLabel("🃔");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 4){
    JLabel label = new JLabel("🃕");
    cardpanel.add(label);
;
label.setFont(new Font("Serif", Font.BOLD, 200));

    
saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 4){
            JLabel labelNew = new JLabel("🃕");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();



        

}
}});;
}


if (randomNum == 5){
    JLabel label = new JLabel("🃖");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 5){
            JLabel labelNew = new JLabel("🃖");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 6){
    JLabel label = new JLabel("🃗");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

    
saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 6){
            JLabel labelNew = new JLabel("🃗");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 7){
    JLabel label = new JLabel("🃘");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

    
saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 7){
            JLabel labelNew = new JLabel("🃘");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}

if (randomNum == 8){
    JLabel label = new JLabel("🃙");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 8){
            JLabel labelNew = new JLabel("🃙");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 9){
    JLabel label = new JLabel("🃚");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

    
saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 9){
            JLabel labelNew = new JLabel("🃚");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 10){
    JLabel label = new JLabel("🃛");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

    
    
saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 10){
            JLabel labelNew = new JLabel("🃛");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 11){
    JLabel label = new JLabel("🃝");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

    
saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 11){
            JLabel labelNew = new JLabel("🃝");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 12){
    JLabel label = new JLabel("🃞");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

    
    
saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 12){
            JLabel labelNew = new JLabel("🃞");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 13){
    JLabel label = new JLabel("🃁");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

    
saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 13){
            JLabel labelNew = new JLabel("🃁");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 14){
    JLabel label = new JLabel("🃂");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 14){
            JLabel labelNew = new JLabel("🃂");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 15){
    JLabel label = new JLabel("🃃");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 15){
            JLabel labelNew = new JLabel("🃃");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 16){
    JLabel label = new JLabel("🃄");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 16){
            JLabel labelNew = new JLabel("🃄");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 17){
    JLabel label = new JLabel("🃅");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 17){
            JLabel labelNew = new JLabel("🃅");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 18){
    JLabel label = new JLabel("🃆");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 18){
            JLabel labelNew = new JLabel("🃆");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 19){
    JLabel label = new JLabel("🃇");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 19){
            JLabel labelNew = new JLabel("🃇");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 20){
    JLabel label = new JLabel("🃈");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 20){
            JLabel labelNew = new JLabel("🃈");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 21){
    JLabel label = new JLabel("🃉");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 21){
            JLabel labelNew = new JLabel("🃉");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 22){
    JLabel label = new JLabel("🃊");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 22){
            JLabel labelNew = new JLabel("🃊");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 23){
    JLabel label = new JLabel("🃋");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 23){
            JLabel labelNew = new JLabel("🃋");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 24){
    JLabel label = new JLabel("🃍");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 24){
            JLabel labelNew = new JLabel("🃍");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 25){
    JLabel label = new JLabel("🃎");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 25){
            JLabel labelNew = new JLabel("🃎");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 26){
    JLabel label = new JLabel("🂱");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 26){
            JLabel labelNew = new JLabel("🂱");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 27){
    JLabel label = new JLabel("🂲");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 27){
            JLabel labelNew = new JLabel("🂲");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 28){
    JLabel label = new JLabel("🂳");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 28){
            JLabel labelNew = new JLabel("🂳");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 29){
    JLabel label = new JLabel("🂴");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 29){
            JLabel labelNew = new JLabel("🂴");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 30){
    JLabel label = new JLabel("🂵");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 30){
            JLabel labelNew = new JLabel("🂵");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 31){
    JLabel label = new JLabel("🂶");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 31){
            JLabel labelNew = new JLabel("🂶");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 32){
    JLabel label = new JLabel("🂷");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 32){
            JLabel labelNew = new JLabel("🂷");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 33){
    JLabel label = new JLabel("🂸");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 33){
            JLabel labelNew = new JLabel("🂸");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 34){
    JLabel label = new JLabel("🂹");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 34){
            JLabel labelNew = new JLabel("🂹");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 35){
    JLabel label = new JLabel("🂺");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 35){
            JLabel labelNew = new JLabel("🂺");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 36){
    JLabel label = new JLabel("🂻");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 36){
            JLabel labelNew = new JLabel("🂻");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 37){
    JLabel label = new JLabel("🂽");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 37){
            JLabel labelNew = new JLabel("🂽");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 38){
    JLabel label = new JLabel("🂾");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 38){
            JLabel labelNew = new JLabel("🂾");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 39){
    JLabel label = new JLabel("🂡");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 39){
            JLabel labelNew = new JLabel("🂡");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 40){
    JLabel label = new JLabel("🂢");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 40){
            JLabel labelNew = new JLabel("🂢");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 41){
    JLabel label = new JLabel("🂣");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 41){
            JLabel labelNew = new JLabel("🂣");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 42){
    JLabel label = new JLabel("🂤");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 42){
            JLabel labelNew = new JLabel("🂤");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 43){
    JLabel label = new JLabel("🂥");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 43){
            JLabel labelNew = new JLabel("🂥");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 44){
    JLabel label = new JLabel("🂦");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 44){
            JLabel labelNew = new JLabel("🂦");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 45){
    JLabel label = new JLabel("🂧");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 45){
            JLabel labelNew = new JLabel("🂧");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 46){
    JLabel label = new JLabel("🂨");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 46){
            JLabel labelNew = new JLabel("🂨");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 47){
    JLabel label = new JLabel("🂩");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 47){
            JLabel labelNew = new JLabel("🂩");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 48){
    JLabel label = new JLabel("🂪");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 48){
            JLabel labelNew = new JLabel("🂪");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 49){
    JLabel label = new JLabel("🂫");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 49){
            JLabel labelNew = new JLabel("🂫");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 50){
    JLabel label = new JLabel("🂭");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 50){
            JLabel labelNew = new JLabel("🂭");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}


if (randomNum == 51){
    JLabel label = new JLabel("🂮");
    cardpanel.add(label);

label.setFont(new Font("Serif", Font.BOLD, 200));

saveToHand.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent savecard) {
        if (randomNum == 51){
            JLabel labelNew = new JLabel("🂮");
            handpanel.add(labelNew);
labelNew.setFont(new Font("Serif", Font.BOLD, 200));
cardpanel.removeAll();


        
        

}
}});;
}



        


        
 

    
        
    }
;});};;};

                     

        
  