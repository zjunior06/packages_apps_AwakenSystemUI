package com.awaken.systemui;

import android.content.Context;

import com.awaken.systemui.dagger.DaggerAwakenGlobalRootComponent;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;

public class AwakenSystemUIFactory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerAwakenGlobalRootComponent.builder()
                .context(context)
                .build();
    }
}
