function isIdLenValid(id) {
	return id.length >= 4;
}

function isIdValueValid(id, idMap) {
	return !idMap[id];
}

function isPwLenValid(pw) {
	return pw.length >= 4;
}

export { isIdLenValid, isIdValueValid, isPwLenValid };