public interface RoutingEntry {
  String getIp();
  String getMask();
  String getGW();
  String getCidr();
  String toString();
}