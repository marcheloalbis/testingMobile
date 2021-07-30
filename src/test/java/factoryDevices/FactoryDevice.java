package factoryDevices;

public class FactoryDevice {

    public enum DeviceType{
        ANDROID,
        IOS,
        WINDOW_PHONE,
        CLOUD
    }

    public static IDevice make(DeviceType type){
        IDevice device;

        switch (type){
            case ANDROID:
                device= new Android();
                break;
            case IOS:
                device= new IOS();
                break;
            case WINDOW_PHONE:
                device= new WindowsPhone();
                break;
            case CLOUD:
                device= new BrowserStack();
                break;
            default:
                device= new Android();
                break;
        }
        return device;
    }

}
