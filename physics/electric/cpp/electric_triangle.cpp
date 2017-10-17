float res;
float amp;
float vol;

float resistance(float _amp, float _vol){
	
	int resist;
	
	resist = _vol / _amp;
	
	return resist;
}

float voltage(float _res, float _amp){
	
	int volt;
	
	volt = _res * _amp;
	
	return volt;
}

float amper(float _vol, float _res){
	
	int am;
	
	am = _vol / _res;
	
	return am;
}
