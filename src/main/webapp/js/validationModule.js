function isIdLenValid(id) {
	return id.length == 9;
}

function isIdExist(id, idMap) {
	return !idMap[id];
}

function isPwLenValid(pw) {
	return pw.length >= 4;
}

export { isIdLenValid, isIdExist, isPwLenValid };