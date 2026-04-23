public class SoSanhHieuSuat {
    public static void main(String[] args) {
      int solannoichuoi =100000;
      System.out.println("Bat dau so sanh hieu suat "+solannoichuoi);

      long startTime= System.currentTimeMillis();
      String s="Hello";
      for (int i=0;i<solannoichuoi;i++) {
          s+="World";
      }
      long endTime= System.currentTimeMillis();
        System.out.println("Thoi gian thuc hien voi String: "+(endTime-startTime) +" ms");

        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < solannoichuoi; i++) {
            sb.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với StringBuilder: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");
        for (int i = 0; i < solannoichuoi; i++) {
            sbf.append(" World");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với StringBuffer: " + (endTime - startTime) + " ms");
    }
}


