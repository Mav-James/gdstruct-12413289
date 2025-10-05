import java.util.ArrayList;
import java.util.List;

    public class Main {
        public static void main(String[] args) {

            Player asuna = new Player(1, "Asuna" ,100);
            Player bacon = new Player(2, "Bacon",200);
            Player jett = new Player(3,"Jett",34);

            PlayerLinkedList playerLinkedList = new PlayerLinkedList();

            playerLinkedList.addToFront(asuna);
            playerLinkedList.addToFront(bacon);
            playerLinkedList.addToFront(jett);

            playerLinkedList.printList();
    }
}