public class JavaRouting implements RoutingEntry {
    
private String ip;
private String mask;
private String gw;
private String cidr;

    @Override
    public String getIp() {
        return this.ip;
    }

    @Override
    public String getMask() {
        return this.mask;
    }

    @Override
    public String getGW() {
        return this.gw;
    }

    @Override
    public String getCidr() {
        return this.cidr;
    }
}

