package com.ernnavigation.ern.api;

import android.support.annotation.NonNull;

import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeEventListener;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeRequestHandler;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeResponseListener;
import com.walmartlabs.electrode.reactnative.bridge.None;
import java.util.*;

public final class NavigationApi {
    private static final Requests REQUESTS;

    static {
        REQUESTS = new NavigationRequests();
    }

    private NavigationApi() {
    }

    @NonNull
    public static Requests requests() {
        return REQUESTS;
    }



    public interface Requests {
        String REQUEST_NAVIGATE = "com.ernnavigation.ern.api.request.navigate";


        void registerNavigateRequestHandler(@NonNull final ElectrodeBridgeRequestHandler<NavigateData, Boolean> handler);

        void navigate(NavigateData navigateData, @NonNull final ElectrodeBridgeResponseListener<Boolean> responseListener);

    }
}