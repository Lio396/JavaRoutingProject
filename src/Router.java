public interface Router {
    private void route(Packet packet);
    private void addRoute(String ip, String mask, String gw);
    private void showRoutingTable();
}
