package com.ernnavigation.ern.api;

import android.support.annotation.NonNull;

import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeHolder;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeRequestHandler;
import com.walmartlabs.electrode.reactnative.bridge.ElectrodeBridgeResponseListener;
import com.walmartlabs.electrode.reactnative.bridge.None;
import com.walmartlabs.electrode.reactnative.bridge.RequestHandlerProcessor;
import com.walmartlabs.electrode.reactnative.bridge.RequestProcessor;
import java.util.*;


final class NavigationRequests implements NavigationApi.Requests {
    NavigationRequests() {}


    @Override
    public void registerNavigateRequestHandler(@NonNull final ElectrodeBridgeRequestHandler<NavigateData, Boolean> handler) {
        new RequestHandlerProcessor<>(REQUEST_NAVIGATE, NavigateData.class, Boolean.class, handler).execute();
    }

    //------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void navigate(NavigateData navigateData,@NonNull final ElectrodeBridgeResponseListener<Boolean> responseListener) {
        new RequestProcessor<>(REQUEST_NAVIGATE,  navigateData, Boolean.class, responseListener).execute();
    }
}