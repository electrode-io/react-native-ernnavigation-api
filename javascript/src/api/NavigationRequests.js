// @flow


export default class NavigationRequests {
    constructor(bridge) {
     this._bridge = bridge;
    }

        /**
         * Registers a handler for a particular api.  This allows javascript to handle a request from native.
         * @param The handler function, taking a single parameter being the data of the request and returning a Promise. Implementer of the handler should either resolve the promise with an object being the response data (if any) or reject the promise with an Error
         */
    registerNavigateRequestHandler( handler : Function): Promise<any> {
        this._bridge.registerRequestHandler("com.ernnavigation.ern.api.request.navigate", handler);
    }

    //------------------------------------------------------------------------------------------------------------------------------------


    /**
      * Helps to navigate between miniapps
      * @param  miniAppName Component name of the miniapp
      * @param {Object} opts Optional parameters
      * @param  opts.initialPayload Payload required for the miniapp
      * @param integer timeout in milliseconds
      * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Boolean }
      */

     navigate(miniAppName: string, opts: any,timeout: number): Promise<any> {
        opts = opts || {};
     const data =  {}
        // verify the required parameter 'miniAppName' is set
        if (miniAppName  == null) {
        throw "Missing the required parameter 'miniAppName' when calling 'NavigationApi#navigate'";
        }
        data['miniAppName'] = miniAppName;
        data['initialPayload'] = opts['initialPayload'];
        return this._bridge.sendRequest("com.ernnavigation.ern.api.request.navigate", { data, timeout })
    }
}
