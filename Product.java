class Product {
    private String name;
    private float unit_price;
    private float quantity;
    private String category;
    private String type;
    private int id;

    // Class constructor
    public Product(){}

    public boolean isAvailable(quantity_r){
        if (quantity ==0 ){
            return false;
        }
        else if (quantity_r <= quantity){
            return true;
        }
    }
    public int getId()
    {
        return id;
    }

    public void updateProduct(){
    this.productorder = Order.updateorder
        if ( quantity_r <= quantity ){
        }
    }

    public String toString(){
        String pinfo= (String.ValueOf(id)+" " +name + " " +quantity " "+unit_price)
        return pinfo;
    }
}
