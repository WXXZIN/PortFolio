import { isIdLenValid, isPwLenValid } from './validationModule.js';

function initSigninModule() {
	const $idInput = $("input[name='id']");
    const $pwInput = $("input[name='pw']");
   	const $idMessage = $("p[id='id-Message']");
   	const $pwMessage = $("p[id='pw-Message']")
    const $submitButton = $("button[id='sign-in']");
    
	function handleIdInputChange() {
		const idValue = $idInput.val();
		const idLenValid = isIdLenValid(idValue);
		
		$idMessage.text(!idLenValid ? "4글자 이상을 입력하세요." : "");

		updateSubmitButton(idLenValid && isPwLenValid($pwInput.val()));
    }
    
    function handlePwInputChange() {
		const pwValue = $pwInput.val();
		const pwLenValid = isPwLenValid(pwValue);
		
		!pwLenValid ? $pwMessage.text("4글자 이상을 입력하세요.") : $pwMessage.text("");
		updateSubmitButton(isIdLenValid($idInput.val()) && pwLenValid);
	}
    
    function updateSubmitButton(isValid) {
		$submitButton.prop("disabled", !isValid);
	}
	
	$idInput.on("input", handleIdInputChange);
    $pwInput.on("input", handlePwInputChange);
}

$(document).ready(function() {
    initSigninModule();
});