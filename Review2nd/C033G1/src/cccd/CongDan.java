package cccd;

public class CongDan implements ICapCanCuocCongDan {

        @Override
    public SoHK getSoHK() {
        return new SoHK();
    }

    @Override
    public CMND getCMND() {
        return new CMND();
    }

    @Override
    public void capCCCDHoanThanh(CCCD cccd) {
        System.out.println("Cong Dan da nhan CCCD");
    }

}
