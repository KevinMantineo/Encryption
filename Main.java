class Main {
  public static void main(String[] args) {

    System.out.println("Cifriamo il nostro testo e trasformiamolo in un testo segreto!");
  }
  Matrice m = new Matrice("TPSIT");
  Vigenere v = new Vigenere(0,12,0,12,m);
  Vigenere v1 = new Vigenere(0,12,0,12,m);
  Vigenere v2 = new Vigenere(0,12,0,12,m);
  Vigenere v3 = new Vigenere(0,12,0,12,m);

  thread t1 = new thread(v);
  thread t2 = new thread(v1);
  thread t3 = new thread(v2);
  thread t4 = new thread(v3);

  t1.start();
  t2.start();
  t3.start();
  t4.start();

  t1.join();
  t2.join();
  t3.join();
  t4.join();
  
}