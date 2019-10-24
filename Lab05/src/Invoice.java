public class Invoice implements  Payable
{
    private String pNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;


    public Invoice( String part, String description, int count,
                    double price )
    {
        pNumber = part;
        partDescription = description;
        setQuantity( count ); // validate and store quantity
        setPricePerItem( price ); // validate and store price per item
    }

    public void setPartNumber( String part )
    {
        pNumber = part;
    }
    public String getPartNumber()
    {
        return pNumber;
    }
    public void setPartDescription( String description )
    {
        partDescription = description;
    }
    public String getPartDescription()
    {
        return partDescription;
    }
    public void setQuantity( int count )
    {
        quantity = ( count < 0 ) ? 0 : count; // quantity cannot be negative
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setPricePerItem( double price )
    {
        pricePerItem = ( price < 0.0 ) ? 0.0 : price; // validate price
    }
    public double getPricePerItem()
    {
        return pricePerItem;
    }


    public String toString()
    {
        return String.format( "%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem() );
    }


    public double earnings()
    {
        return getQuantity() * getPricePerItem(); // calculate total cost
    }
}
