$(function(){
	switch(menu){
		case 'About us':
			$('#about').addClass('active');
			break;
		case 'Contact us':
			$('#contact').addClass('active');
			break;
		case 'Products':
			$('#products').addClass('active');
		default:
			$('#home').addClass('active');
		break;
	}
});