abstract class beverage{
    private void pour(int qty)
    {
        System.out.println("Pour " + qty + " ml of beverage into the glass");
    }
    abstract void addCompliment();

    void Stir(){};
    private void serve()
    {
        System.out.println("Serve to the Consumer");
        System.out.println("---------------------");
        
    }
    public void TemplateMethod(int qty)
    {
        pour(qty);
        addCompliment();
        Stir();
        serve();
    }
}