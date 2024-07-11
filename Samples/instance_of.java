class TypeCheck{
    public static void main(String args[]){
        Object obj=98.89f;
        if(obj instanceof String){
            System.out.println("String");
        }
        else if(obj instanceof Integer){
            System.out.println("Integer");
        }
        else if(obj instanceof Float){
            System.out.println("Float");
        }
        else{
            System.out.println("nothing");
        }
    }
}