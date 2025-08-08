class shape{}

    class rectangle extends shape{
        int length;
        int breadth;

    rectangle (int length,int breadth){
        this.length=length;
        this.breath=breadth;
    }
    void area(){
        int area=length*breath;
        System.Out.println("Area is"+ area)
        
    }
    }
}