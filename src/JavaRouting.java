public class JavaRouting implements RoutingEntry {
private ip;

    @Override
    public String getIpd() {
        return this.ip;
    }

    @Override
    public String getMask() {
        return null;
    }

    @Override
    public String getGW() {
        return null;
    }

    @Override
    public String getCidr() {
        return null;
    }
}

