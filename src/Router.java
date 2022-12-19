public interface Router {
    public void route(Packet packet);
    public void addRoute(String ip, String mask, String gw);
    public void showRoutingTable();
}
