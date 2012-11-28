package net.majorkernelpanic.spydroid;

import edu.brown.cs.systems.modes.lib.ModeManager;

public class SpydroidApplication extends android.app.Application {

    private ModeManager modeManager;

    @Override
    public void onCreate() {
        super.onCreate();
        modeManager = new ModeManager(this);
        modeManager.connectApplication();
    }
    

    @Override
    public void onTerminate() {
        modeManager.disconnectApplication();
        super.onTerminate();
    }
}
