CODE:
class HelloWorld {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

OUTPUT:
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
*
