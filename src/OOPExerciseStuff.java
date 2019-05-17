class Computer {

    public String Brand;
    public double Size;

    public Computer(String typeBrand, double comSize){
        Brand = typeBrand;
        Size = comSize;
    }
    public String getInfo() {
        return String.format("The Brand for this computer is an %s, which is %.1f inches.", Brand, Size);
    }

    public static void main(String[] args) {
        Computer MacBook  = new Computer("Apple", 13.3);
        Computer Inspirion  = new Computer("Dell", 13.54);
        System.out.println(Inspirion.getInfo());
        System.out.println(MacBook.getInfo());
    }

}
