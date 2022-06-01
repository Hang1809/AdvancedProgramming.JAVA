package cccd;

public class CongAn implements IChuyenCanCuocCongDan{

    void capCanCuocCongDan(ICapCanCuocCongDan capCanCuocCongDan){

        if (capCanCuocCongDan.getSoHK()== null){
            System.out.println("Can co so ho khau");
            return;
        }
        if (capCanCuocCongDan.getCMND() == null){
            System.out.println("Can co CMND");
            return;
        }
        System.out.println("xac minh giay to lien quan");
        System.out.println("Can cuoc cong dan hoan thanh");
        CCCD cccd = new CCCD();
        capCanCuocCongDan.capCCCDHoanThanh(cccd);
    }


    public void sendCCCD() {
        System.out.println("Chuyen can cuoc cong dan ve tan nha dan");
    }


}
