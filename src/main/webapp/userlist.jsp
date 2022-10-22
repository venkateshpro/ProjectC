<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>CakeZone - Cake Shop Website Template</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free HTML Templates" name="keywords">
    <meta content="Free HTML Templates" name="description">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&family=Oswald:wght@500;600;700&family=Pacifico&display=swap" rel="stylesheet"> 

    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
</head>
<body>
<body>
<!-- Topbar Start -->
    <div class="container-fluid px-0 d-none d-lg-block">
        <div class="row gx-0">
            <div class="col-lg-4 text-center bg-secondary py-3">
                <div class="d-inline-flex align-items-center justify-content-center">
                    <div class="text-start">
                      
                    </div>
                </div>
            </div>
            <div class="col-lg-4 text-center bg-primary border-inner py-3">
                <div class="d-inline-flex align-items-center justify-content-center">
                    <a href="index.html" class="navbar-brand">
                        <h1 class="m-0 text-uppercase text-white"><i class="fa fa-birthday-cake fs-1 text-dark me-3"></i>CakeZone</h1>
                    </a>
                </div>
            </div>
            <div class="col-lg-4 text-center bg-secondary py-3">
                <div class="d-inline-flex align-items-center justify-content-center">
                    <div class="text-start">
                     <a href="Admin.jsp"><button class="btn btn-warning">Back</button></a>
                      	
                    </div>
                </div>
            </div>
        </div>
    </div>
	<table class="table">
	


	</table>
	<section class="intro">
		<div class="bg-image h-100" style="background-color: #f5f7fa;">
			<div class="mask d-flex align-items-center h-100">
				<div class="container">
					<div class="row justify-content-center">
						<div class="col-12">
							<div class="card shadow-2-strong">
								<div class="card-body p-0">
									<div class="table-responsive table-scroll"
										data-mdb-perfect-scrollbar="true"
										style="position: relative; height: 700px">
										<table class="table table-light mb-0">
											<thead style="background-color: #393939;">
											
												<tr class="text-uppercase text-warning">
													<th scope="col">User Id</th>
													<th scope="col">User Name</th>
													<th scope="col">User Email</th>
													<th scope="col"> password</th>
												</tr>
											
											</thead>
											<tbody>
												<c:forEach items="${listusers}" var="c">
											         <tr>
											           <td>${c.userid}</td>
											           <td>${c.username}</td>
											           <td>${c.email}</td>
											          <td>${c.password}</td>
											          
	  											</c:forEach>
         			
        									</tbody>			
                  </table>
                  <div>
                  <form action="/userid" method="post">
                  	
                  	<input class="m-4" type="number" value="${c.userid}" name="userid" placeholder="enter id" >
                  	<button type= "submit" class="btn btn-warning">update</button>
                  
                  </form>
                  
                   <form action="/deleteuserbyid" method="post">
                  	
                  	<input class="m-4" type="number" value="${c.userid}" name="id" placeholder="enter id" >
                  	<button type= "submit" class="btn btn-warning">delete</button>
                  
                  </form>
                  
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>
      
      
      
    
</body>

</body>
</html>