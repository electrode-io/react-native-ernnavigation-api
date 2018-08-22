import { electrodeBridge } from 'react-native-electrode-bridge';
import NavigationRequests from './NavigationRequests';

const REQUESTS = new NavigationRequests(electrodeBridge);

export function requests() {
    return REQUESTS;
}


export default ({requests});


