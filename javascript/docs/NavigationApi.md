# react-native-ernnavigation-api.NavigationApi


Method | Type | Description
------------- | ------ | -------------
[**navigate**](NavigationApi.md#navigate) | request | 

<a name="navigate"></a>
# **navigate**
> Boolean navigate(miniAppNameopts)



Helps to navigate between miniapps

### Example
```javascript
import { NavigationApi } from 'javascript';
    //Make a request
    //assuming async function wrapper
const requests = NavigationApi.requests();
    const opts = { 
  'initialPayload': "initialPayload_example" // String | Payload required for the miniapp
};
    try {
    const data = await requests.navigate(miniAppNameopts);
  console.log('API called successfully. Returned data: ', data);
   }catch(e){
      console.log('an error',e);
    }

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **miniAppName** | **String**| Component name of the miniapp | 
 **initialPayload** | **String**| Payload required for the miniapp | [optional] 

### Return type

**Boolean**

