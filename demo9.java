public class demo13 {
    void main() throws InterruptedException {


      // 1st -------
//        int x,y;
//        for(System.out.print(" + "),x=3, y=0; x-- >y ;System.out.print(x!=y?" + \n + " :" + ")){
//            for(int k= -3; k<y; k++)System.out.print(" * ");
//        }

      // 2nd---------
//
//        for(int x=202,k=0; x>197 ;x--, Thread.sleep(200) ,System.out.print("\r")){
//            for(k=0,System.out.print(STR."\{(203-x)} . ") ; k <5 ;k++,Thread.sleep(200)){
//                System.out.print(" * ");
//            }
//       }


      // 3rd ----------
        for( int x=0,y=5 ; x !=y ;x++,y=5,System.out.print(x==5?"":"\033[31m +\n\033[0m")){
            for(System.out.print(" + "); x +2< y  ; y--){
                System.out.print(" * ");
            }
        }

    }
}
