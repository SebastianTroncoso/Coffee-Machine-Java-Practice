class ManufacturingController {

    private static int requestedProductsCount = 0;

    public static String requestProduct(String product) {
        return ++requestedProductsCount + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        return requestedProductsCount;
    }
}