public interface RoutingEntry {
  String getId();
  String getMask();
  String getGW();
  String getCidr();
  String toString();
}