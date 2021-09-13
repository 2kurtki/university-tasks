package secondLection;

class SixthTask {

    public static void main(String[] args){

        NetworkInfo networkObj = getNetworkObj("Home", "qwerty", "WPA");
        networkObj.showParameters();
    }

    static class NetworkInfo{

        String ssid;
        String passwd;
        String securityType;

        NetworkInfo(String ssid, String passwd, String securityType){
            this.ssid = ssid;
            this.passwd = passwd;
            this.securityType = securityType;
        }

        void showParameters(){
            System.out.printf("Parameters| Ssid: %s, Password: %s, Security type: %s", ssid, passwd, securityType);
        }
    }

    static NetworkInfo getNetworkObj(String ssid, String passwd, String securityType){

        NetworkInfo obj = new NetworkInfo(ssid, passwd, securityType);
        return obj;
    }
}


