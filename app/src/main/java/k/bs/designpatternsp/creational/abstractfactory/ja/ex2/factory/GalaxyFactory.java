package k.bs.designpatternsp.creational.abstractfactory.ja.ex2.factory;

import k.bs.designpatternsp.creational.abstractfactory.ja.ex2.ap.AP;
import k.bs.designpatternsp.creational.abstractfactory.ja.ex2.ap.GalaxyNote;
import k.bs.designpatternsp.creational.abstractfactory.ja.ex2.battery.Battery;
import k.bs.designpatternsp.creational.abstractfactory.ja.ex2.battery.SamsungBattery;

public class GalaxyFactory implements SmartPhoneFactory {
    @Override
    public AP createAP(Battery battery) {
        return new GalaxyNote(battery);
    }

    @Override
    public Battery createBattery() {
        return new SamsungBattery();
    }
}
