package com.awaken.systemui.dagger;

import android.content.Context;

import com.android.systemui.dagger.GlobalModule;
import com.android.systemui.dagger.GlobalRootComponent;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
    GlobalModule.class,
})
public interface AwakenGlobalRootComponent extends GlobalRootComponent {

    @Component.Builder
    interface Builder extends GlobalRootComponent.Builder {
        @BindsInstance
        @Override
        Builder context(Context context);

        AwakenGlobalRootComponent build();
    }

    @Override
    AwakenSysUIComponent.Builder getSysUIComponent();
}
