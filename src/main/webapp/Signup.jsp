<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ page import="com.otpdata.OTPGenerater" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>satheesh</title>
<link href="https://cdn.lineicons.com/4.0/lineicons.css"
	rel="stylesheet" />
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="style.css">
<style>
.custom-container {
	max-width: 50%;
	animation: fadeIn 1s ease-in-out;
}

@
keyframes fadeIn {from { opacity:0;
	transform: translateY(-20px);
}

to {
	opacity: 1;
	transform: translateY(0);
}

}
.form-control {
	transition: all 0.3s ease;
}

.form-control:focus {
	box-shadow: 0 0 10px rgba(0, 123, 255, 0.5);
	transform: scale(1.02);
}

.directory-heading {
	background-color: #0e2238;
	border: 1px solid #dee2e6;
	padding: 10px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	display: inline-block;
	margin-bottom: -20px;
	font-family: 'Courier New', Courier, monospace;
}

.step {
	display: none;
}

.step.active {
	display: block;
}

#otpDiv {
	display: none;
}
</style>
</head>
<body>
	<div class="wrapper">

		<div class="main">

			<div class="container text-center mt-5">
				<h2 class="directory-heading text-white ">Sign Up</h2>
			</div>

			<div class="container custom-container rounded-5 mt-5 shadow-lg p-5">
				<div class="progress mb-4">
					<div id="progress-bar"
						class="progress-bar progress-bar-animated  progress-bar-striped "
						role="progressbar" style="width: 0%;" aria-valuenow="0"
						aria-valuemin="0" aria-valuemax="100"></div>
				</div>

				<form id="regForm" action="validateUser">
					<div class="step active">
						<div class="row mb-3">
							<div class="col">
								<label for="name" class="form-label">Name</label> <input
									type="text" id="name" name="name" class="form-control" required>
							</div>
						</div>
						<div class="row mb-3">
							<div class="col">
								<label for="username" class="form-label">UserName</label> <input
									type="text" id="username" name="username" class="form-control">
							</div>
						</div>
						<div class="row mb-3">
							<div class="col">
								<label for="dob" class="form-label">Date Of Birth</label> <input
									type="date" id="dob" name="dob" class="form-control">
							</div>
						</div>
						<div class="row mb-3">
							<a href="FrontPage.jsp">Already have an account?</a>
						</div>
					</div>

					<div class="step">

						<div class="row mb-3">
							<div class="col">
								<label for="email" class="form-label">Email</label> <input
									type="email" id="email" name="email" class="form-control">
							</div>
						</div>
						<div class="row mb-3">
							<div class="col">
								<label for="newPassword" class="form-label">New Password</label>
								<input type="password" id="password" name="password"
									class="form-control" required>
								<div id="newPasswordMessage" style="color: red;"></div>
							</div>
						</div>
						<div class="row mb-3">
							<div class="col">
								<label for="confirmPassword" class="form-label">Confirm
									Password</label> <input type="password" id="confirmPassword"
									name="confirmPassword" class="form-control" required>
								<div id="confirmPasswordMessage" style="color: red;"></div>
							</div>
						</div>
<!-- 						<div class="row mb-3">
							<div class="col">
								<input type="button" class="btn btn-primary w-100"
									value="Generate OTP" id="otp">
							</div>
						</div> -->
<!-- 						<div class="row mb-3">
							<div class="col" id="otpDiv">
								<input type="text" class="form-control" placeholder="Enter OTP"
									id="OtpBox" name="otp" required>
							</div>
						</div> -->

					</div>

<!-- 					<div class="step">
						<div class="form-check">
							<input class="form-check-input" type="radio" name="state"
								value="beginner"> <label class="form-check-label"
								for="beginner"> Beginner </label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="state"
								value="intermediate" checked> <label
								class="form-check-label" for="intermediate">
								Intermediate </label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="radio" name="state"
								value="expert" checked> <label class="form-check-label"
								for="expert"> Expert </label>
						</div>

					</div> -->

					<div class="text-center">
						<button type="button" id="prevBtn" class="btn btn-secondary"
							onclick="nextPrev(-1)">Previous</button>
						<button type="button" id="nextBtn" class="btn btn-primary"
							onclick="nextPrev(1)">Next</button>
					</div>
				</form>
			</div>
		</div>
	</div>


<!-- 	<script>
		$(document)
				.ready(
						function() {

							$('#password')
									.on(
											'keyup',
											function() {
												var newPassword = $('#password')
														.val();
												var confirmPassword = $(
														'#confirmPassword')
														.val();
												var passwordRegex = /^(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-zA-Z]).{8,}$/;
												if (!passwordRegex
														.test(newPassword)) {
													$('#newPasswordMessage')
															.text(
																	'Password must be at least 8 characters long and contain at least one number, one special character, and one letter.')
															.css('color', 'red');
												} else {
													$('#newPasswordMessage')
															.text('');
												}
											});

							$("#confirmPassword").on(
									'keyup',
									function() {
										var newPassword = $('#newPassword')
												.val();
										var confirmPassword = $(
												'#confirmPassword').val();

										if (newPassword !== confirmPassword
												|| newPassword === ''
												|| confirmPassword === '') {
											$('#confirmPasswordMessage').text(
													'Passwords do not match!')
													.css('color', 'red');
										} else {
											$('#confirmPasswordMessage').text(
													'');
										}
									});

						});
	</script> -->

	<script>
		let currentTab = 0;
		showTab(currentTab);

		function showTab(n) {
			let x = document.getElementsByClassName("step");
			x[n].classList.add("active");
			if (n == 0) {
				document.getElementById("prevBtn").style.display = "none";
			} else {
				document.getElementById("prevBtn").style.display = "inline";
			}
			if (n == (x.length - 1)) {
				document.getElementById("nextBtn").innerHTML = "Generate OTP";
			} else {
				document.getElementById("nextBtn").innerHTML = "Next";
			}
			updateProgressBar(n);
		}

		function nextPrev(n) {
			let x = document.getElementsByClassName("step");
			x[currentTab].classList.remove("active");
			currentTab = currentTab + n;
			if (currentTab >= x.length) {
				document.getElementById("regForm").submit();
				return false;
			}
			showTab(currentTab);
		}

		function updateProgressBar(n) {
			let progressBar = document.getElementById("progress-bar");
			let steps = document.getElementsByClassName("step");
			let progress = ((n + 1) / steps.length) * 100;
			progressBar.style.width = progress + "%";
			progressBar.setAttribute("aria-valuenow", progress);
		}
	</script>
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.min.js"></script>
	<script
	 	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
	 	
<%--     <%
        String email = request.getParameter("email");
        if (email != null && !email.isEmpty()) {
            try {
                OTPGenerater.sendMain(email);  // Ensure this method is correctly implemented
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    %> --%>
</body>
</html>