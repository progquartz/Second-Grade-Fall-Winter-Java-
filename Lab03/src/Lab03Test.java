public class Lab03Test {
    public static void main(String[] args){
        Deck dk = new Deck();
        dk.printDeck();
        dk.shuffle();
        dk.printDeck();
        dk.dealCard();

        Race rc = new Race();
        rc.run();
        TicTacToe a = new TicTacToe();
        a.play();
    }

}
