package cc.openhome.vetual;

class Some {
    Some() {
        System.out.println("调用Some（）");
    }
    Some(int i) {
        System.out.println("调用Some（int i）");
    }    
}

class Other extends Some{
    Other() {
        super();
        System.out.println("调用Other（）");        
    }
    public static void main(String[] args) {
        new Other();
    }
    
}
