import java.io.IOException;

class Help {
  public static void main(String[] args) throws IOException {
    char choice, ignore;
    
    for (;;) {
      do {
        System.out.println("Справка: \n");
        System.out.println(" 1: if");
        System.out.println(" 2: switch");
        System.out.println(" 3: for");
        System.out.println(" 4: while");
        System.out.println(" 5: do-while");
        System.out.println(" 6: break");
        System.out.println(" 7: continue\n");
        System.out.print("Выберите (q - выход): ");

        choice = (char) System.in.read();
        do {
          ignore = (char) System.in.read();
        } while (ignore != '\n');
      } while (choice < '1' | choice > '7' & choice != 'q');

      if (choice == 'q') break;

      System.out.println("\n");

      switch(choice) {
        case '1':
          System.out.println("Инструкция if:\n");
          break;
        case '2':
          System.out.println("Инструкция swith:\n");
          break;
        case '3':
          System.out.println("Инструкция for:\n");
          break;
        case '4':
          System.out.println("Инструкция while:\n");
          break;
        case '5':
          System.out.println("Инструкция d0-while:\n");
          break;
        case '6':
          System.out.println("Инструкция break:\n");
          break;
        case '7':
          System.out.println("Инструкция continue:\n");
          break;
      }
      System.out.println();
    }
  }
}