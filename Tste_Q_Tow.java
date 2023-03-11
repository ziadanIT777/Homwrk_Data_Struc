public class Tste_Q_Tow {
    public static void main ( String[] args ) {

      Q_Two[] arry = new Q_Two[2];
      arry[0]=new Q_Two ( "zeidane",773580,19 );
      arry[1]=new Q_Two ( "Ahmmde",773576,20 );

      Q_Two[] arry2 = new Q_Two[arry.length];

      arry2 = arry;

        for (int i = 0; i < arry2.length; i++) {

            System.out.println (arry2[i].toString ());
        }
    }
}
