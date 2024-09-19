package org.example;

public class BirtdahyArgs {
    public static void main(String[] args) {
        if (args.length==0){
            System.out.println("Use: BirthdayArgs n num1 num2 ... numn");
        }
        else{
            int numCases= Integer.parseInt(args[0]);
            if (numCases == args.length-1){
                int cases=1;
                while(cases<=numCases){
                    int age=Integer.parseInt(args[cases]);
                    String binaryAge = Integer.toBinaryString(age);
                    int cont=0;
                    for (int i = 0; i <binaryAge.length(); i++) {
                        if(binaryAge.charAt(i)=='1')
                            cont++;
                    }
                    System.out.println(cont);
                    cases++;
                }
            }
            else {
                System.out.println("Use: BirthdayArgs n num1 num2 ... numn");
            }
        }

    }
}
