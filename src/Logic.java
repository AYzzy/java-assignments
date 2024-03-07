public class Logic {
    public int logistics(int successfulDelivery){
        int amountPerDelivery = 0;
        if(successfulDelivery<0) throw new IllegalArgumentException("invalid number");
        else if (successfulDelivery <= 50) {
            return successfulDelivery * 160 + 5000;
        } else if (successfulDelivery > 51 && successfulDelivery < 60) {
            return successfulDelivery * 200 + 5000;
        } else if (successfulDelivery >= 61 && successfulDelivery < 70) {
            return successfulDelivery * 250 + 5000;
        } else {
            return successfulDelivery * 500 + 5000;
        }
    }
}
