import java.util.*;

class binToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int no = sc.nextInt();

        String bin = "";

        while(no != 0){
            bin = (no&1) + bin;
            no=no>>1;
        }

        bin=bin.replace("1", "2");
        bin=bin.replace("0", "1");
        bin= bin.replace("2", "0");

        int res = Integer.parseInt(bin , 2);

        System.out.println(res);
    }
}
