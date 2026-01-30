public class LogicalOps {
    public static void main(String[] args) {

        boolean isRaining = true;
        boolean hasUmbrella = false;
        boolean isCold = true;

        System.out.println("isRaining AND hasUmbrella: " + (isRaining && hasUmbrella));
        System.out.println("isRaining OR hasUmbrella: " + (isRaining || hasUmbrella));
        System.out.println("NOT isRaining: " + (!isRaining));
        System.out.println("isRaining AND (hasUmbrella OR isCold): "
                            + (isRaining && (hasUmbrella || isCold)));
    }
}
