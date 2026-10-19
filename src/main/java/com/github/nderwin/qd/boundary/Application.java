package com.github.nderwin.qd.boundary;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.annotations.RegisterResourceBundle;
import jakarta.enterprise.event.Observes;

@RegisterResourceBundle(bundleName = "messages")
public class Application {

    void startup(@Observes StartupEvent evt) {
        FlatLaf.setPreferredFontFamily("Noto Sans");
        FlatLightLaf.setup();
    }

}
