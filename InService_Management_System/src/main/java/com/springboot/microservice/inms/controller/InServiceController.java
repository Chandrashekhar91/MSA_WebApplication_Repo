package com.springboot.microservice.inms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class InServiceController {

	@RequestMapping(value="/Login", method =RequestMethod.POST)
	public ModelAndView mainInserviceMethod(HttpServletRequest request) {
		// TODO Auto-generated method stub
		try {

			if (request.getParameter("page").equalsIgnoreCase("Login")) {

				String code = request.getParameter("code");
				String captcha = (String) request.getSession().getAttribute("captcha");
				MySession = request.getSession(true);
				if (code.equals(captcha)) {

					// nf/h78Lwj7QTi8ZMW4YLbg==
					log.info("Entered into Login Page");
					String name = request.getParameter("name");
					String passwd = request.getParameter("passwd");
					LoginBean l = new LoginBean();
					l.setName(name);
					l.setPassword(passwd);
					LoginDao d = new LoginDao();
					log.debug("call to login dao");
					String status = d.Authenticate(l);
					if (status == null) {
						request.getRequestDispatcher("/_Login.jsp").forward(request, response);

					}
					if (status.equalsIgnoreCase("A")) {
						request.getRequestDispatcher("/_Admin.jsp").forward(request, response);
						log.info("Navigated to Admin home page");

					}
					if (status.equalsIgnoreCase("C")) {
						request.getRequestDispatcher("/_Clerk.jsp").forward(request, response);
						log.info("Navigated to Clerk home page");

					} else {
						LoginBean bn = new LoginBean();
						bn.setName(name);
						bn.setCustiomerID(status);
						ArrayList<Integer> lbn = d.GetDetails(bn);
						// bn.setMyIDs(lbn.getMyIDs());

						MySession.setAttribute("MyDetails", bn);
						MySession.setAttribute("custList", lbn);
						request.getRequestDispatcher("/_Customer.jsp").forward(request, response);
						log.info("Navigated to Customer home page");
					}
				} else {
					response.sendRedirect("_Login.jsp");
				}

			}
		}
	}
		@RequestMapping(value="/homeCustomer", method =RequestMethod.POST)
		public ModelAndView homeCustomer(HttpServletRequest request) {
			
			if (request.getParameter("page").equalsIgnoreCase("homeCustomer")) {
				int requestID = Integer.parseInt(request.getParameter("requestID"));
				MySession = request.getSession(true);
				LoginBean logBn = (LoginBean) MySession.getAttribute("MyDetails");
				logBn.setRequestID(requestID);
				MySession.setAttribute("MyDetails", logBn);
				if (request.getParameter("btn").equalsIgnoreCase("Choose your Preferred House Keeping Service(s)")) {
					log.info("Entered into service page");
					HouseKeepingDAO d = new HouseKeepingDAO();
					ArrayList<HouseKeepingBean> viewList = d.viewCustomer();

					int days = d.NoOfDays(requestID);
					request.setAttribute("result", viewList);
					request.setAttribute("days", days);

					request.getRequestDispatcher("/ServicesViewCustomerForm.jsp").forward(request, response);
					log.info("Services are selected");
				}
				if (request.getParameter("btn").equalsIgnoreCase("View/Cancel House Keeping Services")) {

					HouseKeepingDAO d = new HouseKeepingDAO();
					log.debug("call to houseKeeping dao");
					ArrayList<HouseKeepingBean> viewList = d.viewCust(requestID);

					request.setAttribute("result", viewList);
					request.getRequestDispatcher("/ServicesCancelCustForm.jsp").forward(request, response);
					log.info("Services are viewed and deselected");
				}

				if (request.getParameter("btn").equalsIgnoreCase("View Bill")) {
					BillDao bd = new BillDao();
					MySession = request.getSession(true);
					LoginBean l1 = (LoginBean) MySession.getAttribute("MyDetails");
					int req1 = Integer.parseInt(request.getParameter("requestID"));
					BillBean bn = bd.CustBillView(req1);
					request.setAttribute("beanObj", bn);
					request.getRequestDispatcher("/BillViewCustomerForm.jsp").forward(request, response);
					log.info("view bill");
				}

				if (request.getParameter("btn").equalsIgnoreCase("Give your Feedback")) {
					request.getRequestDispatcher("/FeedbackInsertCustForm.jsp").forward(request, response);
					log.info("Customer feedback is obtained");
				}

				if (request.getParameter("btn").equalsIgnoreCase("View your Feedbacks")) {
					FeedbackDao dao = new FeedbackDao();
					log.debug("call to feedback dao");
					int reqID = Integer.parseInt(request.getParameter("requestID"));
					Feedbackbean bn = new Feedbackbean();

					bn.setRequest_Id(reqID);
					Feedbackbean bn1 = dao.select(bn);
					request.setAttribute("data", bn1);
					request.getRequestDispatcher("/FeedbackViewCustForm.jsp").forward(request, response);
					log.info("Customer feedback is viewed");
				}

				if (request.getParameter("btn").equalsIgnoreCase("Update your Feedback")) {

					FeedbackDao dao = new FeedbackDao();
					log.debug("call to feedback dao");

					int reqID = Integer.parseInt(request.getParameter("requestID"));
					Feedbackbean bn = new Feedbackbean();

					bn.setRequest_Id(reqID);
					Feedbackbean bn1 = dao.select(bn);
					request.setAttribute("data", bn1);
					request.getRequestDispatcher("/FeedbackUpdateCustForm.jsp").forward(request, response);
					log.info("Customer feedback is updated");
				}

				if (request.getParameter("btn").equalsIgnoreCase("Delete your Feedbacks")) {
					FeedbackDao dao = new FeedbackDao();
					log.debug("call to feedback dao");
					int reqID = Integer.parseInt(request.getParameter("requestID"));
					Feedbackbean bn = new Feedbackbean();

					bn.setRequest_Id(reqID);
					int status = dao.Delete(bn);
					if (status == 1) {
						request.setAttribute("msg", "Feedback is  Successfully Deleted");
					} else {
						request.setAttribute("msg", "Please Give The Feedback");
					}
					request.getRequestDispatcher("/HomePageCustomer.jsp").forward(request, response);
					log.info("Customer feedback is deleted");
				}

				if (request.getParameter("btn").equalsIgnoreCase("Register your Complaint")) {
					request.getRequestDispatcher("/ComplaintInsertCustForm.jsp").forward(request, response);
					log.info("Customers are allowed to register their complaints");

				}

				if (request.getParameter("btn").equalsIgnoreCase("View your Complaints")) {
					ComplaintDao dao = new ComplaintDao();
					int reqID = Integer.parseInt(request.getParameter("requestID"));
					Complaintbean bn = new Complaintbean();

					bn.setRequest_Id(reqID);
					Complaintbean bn1 = dao.select(bn);
					request.setAttribute("data", bn1);
					request.getRequestDispatcher("/ComplaintViewCustForm.jsp").forward(request, response);
					log.info("Customers are allowed to view their complaints");

				}

				if (request.getParameter("btn").equalsIgnoreCase("Update your Complaint")) {

					ComplaintDao dao = new ComplaintDao();
					int reqID = Integer.parseInt(request.getParameter("requestID"));
					Complaintbean bn = new Complaintbean();

					bn.setRequest_Id(reqID);
					Complaintbean bn1 = dao.select(bn);
					request.setAttribute("data", bn1);
					request.getRequestDispatcher("/ComplaintUpdateCustForm.jsp").forward(request, response);
					log.info("Customers are allowed to update their complaints");
				}

				if (request.getParameter("btn").equalsIgnoreCase("Delete your Complaints")) {
					ComplaintDao dao = new ComplaintDao();
					int reqID = Integer.parseInt(request.getParameter("requestID"));
					Complaintbean bn = new Complaintbean();

					bn.setRequest_Id(reqID);
					int status = dao.delete(bn);
					request.setAttribute("msg", "Complaint is  Successfully Deleted");
					request.getRequestDispatcher("/HomePageCustomer.jsp").forward(request, response);
					log.info("Customers are allowed to delete their complaints");

				}

			}
			if (request.getParameter("page").equalsIgnoreCase("homeAdmin")) {

				if (request.getParameter("btn").equalsIgnoreCase("Add New Services")) {
					request.getRequestDispatcher("/ServicesInsertAdminForm.jsp").forward(request, response);
					log.info("Services are added by admin");

				}
				if (request.getParameter("btn").equalsIgnoreCase("View Customer Usage of Services")) {
					HouseKeepingDAO d = new HouseKeepingDAO();
					log.debug("call to House Keeping dao");
					ArrayList<HouseKeepingBean> viewList = d.viewAdmin();

					request.setAttribute("result", viewList);

					request.getRequestDispatcher("/ServicesViewAdminForm.jsp").forward(request, response);
					log.info("Services opted by customer are viewed by admin");

				}
				if (request.getParameter("btn").equalsIgnoreCase("View/Delete Existing Services")) {

					HouseKeepingDAO d = new HouseKeepingDAO();
					log.debug("call to House Keeping dao");
					ArrayList<HouseKeepingBean> viewList = d.viewAdminDelete();

					request.setAttribute("result", viewList);

					request.getRequestDispatcher("/ServicesDeleteAdminForm.jsp").forward(request, response);
					log.info("Services are viewed and deleted  by admin");

				}
				if (request.getParameter("btn").equalsIgnoreCase("Update Existing Services")) {
					HouseKeepingDAO empDao = new HouseKeepingDAO();
					log.debug("call to House Keeping dao");
					ArrayList<HouseKeepingBean> medList = empDao.getMediums();
					request.setAttribute("lakshmi", medList);
					request.getRequestDispatcher("/ServicesUpdateDeleteAdminForm.jsp").forward(request, response);
					log.info("Services are updated by admin");

				}
				if (request.getParameter("btn").equalsIgnoreCase("View Bills")) {
					BillDao d = new BillDao();
					log.debug("call to Bill dao");
					ArrayList<BillBean> viewList = d.BillViewAdmin();
					request.setAttribute("result", viewList);

					request.getRequestDispatcher("/BillViewAdminForm.jsp").forward(request, response);
					log.info("Customer bill details are viewed by admin");

				}
				if (request.getParameter("btn").equalsIgnoreCase("View Bills by Date")) {
					BillBean billBean = new BillBean();
					BillDao Billobj = new BillDao();
					log.debug("call to Bill dao");
					billBean.setBill_date(request.getParameter("cindate"));

					ArrayList<BillBean> BillList = new ArrayList<BillBean>();
					BillList = Billobj.viewAdminBill(billBean);

					request.setAttribute("result", BillList);

					request.getRequestDispatcher("/BillViewAdminForm.jsp").forward(request, response);
					log.info("Customer bill details are viewed by admin based on date");

				}
				if (request.getParameter("btn").equalsIgnoreCase("View Feedbacks")) {
					FeedbackDao fbDao = new FeedbackDao();
					log.debug("call to FeedBack dao");
					ArrayList<Feedbackbean> fb = fbDao.viewAll();
					request.setAttribute("value", fb);
					request.getRequestDispatcher("/FeedbackViewAdminForm.jsp").forward(request, response);
					log.info("Customer feedbacks are viewed by admin");

				}
				if (request.getParameter("btn").equalsIgnoreCase("View Complaints")) {

					ComplaintDao comdao = new ComplaintDao();
					log.debug("call to Complaint dao");
					ArrayList<Complaintbean> compList = comdao.viewAll();

					request.setAttribute("value", compList);
					request.getRequestDispatcher("/ComplaintViewAdminForm.jsp").forward(request, response);
					log.info("Customer complaints are viewed by admin");

				}
			}

			if (request.getParameter("page").equalsIgnoreCase("homeClerk")) {

				if (request.getParameter("btn").equalsIgnoreCase("Generate")) {

					int CustomerID = Integer.parseInt(request.getParameter("generate"));

					BillDao b = new BillDao();
					log.debug("call to Bill dao");
					BillBean bn = b.showBill(CustomerID);
					request.setAttribute("beanObj", bn);
					request.getRequestDispatcher("/BillGenerateClerkForm.jsp").forward(request, response);
					log.info("Customer bill is generated by clerk");

				}
				if (request.getParameter("btn").equalsIgnoreCase("View")) {

					BillDao d = new BillDao();
					log.debug("call to Bill dao");
					ArrayList<BillBean> viewList = d.BillViewAdmin();
					request.setAttribute("result", viewList);

					request.getRequestDispatcher("/BillViewClerkForm.jsp").forward(request, response);
					log.info("Customer bill is viewed by clerk");

				}
				if (request.getParameter("btn").equalsIgnoreCase("Delete")) {
					BillDao d = new BillDao();
					log.debug("call to Bill dao");
					ArrayList<BillBean> viewList = d.BillViewAdmin();
					request.setAttribute("result", viewList);

					request.getRequestDispatcher("/BillDeleteClerkForm.jsp").forward(request, response);
					log.info("Customer bill details are  deleted by clerk");

				}

			}

			if (request.getParameter("page").equalsIgnoreCase("insert")) {
				String code = request.getParameter("code");
				String captcha = (String) request.getSession().getAttribute("captcha");
				if (code.equals(captcha)) {
					int serviceID = Integer.parseInt(request.getParameter("serviceID"));
					String servicename = request.getParameter("servicename");
					int price = Integer.parseInt(request.getParameter("price"));
					HouseKeepingBean bn = new HouseKeepingBean();
					bn.setServiceID(serviceID);
					bn.setServiceName(servicename);
					bn.setPrice(price);
					HouseKeepingDAO d = new HouseKeepingDAO();
					log.debug("call to House Keeping dao");
					int Status = d.InsertAdmin(bn);

					if (Status == 1) {
						request.setAttribute("msg", "Successfully Added the Service " + servicename);
					} else {
						request.setAttribute("msg",
								"Another Service with the Service ID " + serviceID + " already exists");
					}
					getServletContext().getRequestDispatcher("/HomePageAdmin.jsp").forward(request, response);
					log.info("New service is added by admin");
				} else {
					response.sendRedirect("insertcapctha.jsp");
				}
			}
			if (request.getParameter("page").equalsIgnoreCase("viewCustomer")) {
				String[] select = request.getParameterValues("check");

				if (select != null) {

					for (String s : select) {
						System.out.println(s);
						System.out.println(Integer.parseInt(s));
						String CustomerID = (request.getParameter("customerid"));
						int requestID = Integer.parseInt(request.getParameter("requestid"));
						int serviceID = Integer.parseInt(s);
						int days = Integer.parseInt(request.getParameter(s));
						String serviceName = (request.getParameter("serviceName"));
						// int price=
						// Integer.parseInt(request.getParameter("price".concat(s)));
						// int amount= days*price;

						HouseKeepingBean bn = new HouseKeepingBean();
						// bn.setAmount(amount);
						// bn.setPrice(price);
						bn.setCustomerID(CustomerID);
						bn.setServiceID(serviceID);
						bn.setRequestId(requestID);
						bn.setNoOfDays(days);
						HouseKeepingDAO d = new HouseKeepingDAO();
						log.debug("call to House Keeping dao");
						HouseKeepingBean bean = d.AddAdmin(bn);
					}
					request.setAttribute("msg", "Services are Successfully selected");
					request.getRequestDispatcher("/HomePageCustomer.jsp").forward(request, response);
					log.info("Selected services are viewed by customer");

				}

			}

			if (request.getParameter("page").equalsIgnoreCase("update")) {

				String ca = (String) request.getSession().getAttribute("captcha");

				String code = request.getParameter("code");
				if (ca.equalsIgnoreCase(code)) {
					int empid = Integer.parseInt(request.getParameter("Medium"));

					String empname = request.getParameter("servicename");
					int empage = Integer.parseInt(request.getParameter("price"));
					HouseKeepingBean empBean = new HouseKeepingBean();
					empBean.setServiceID(empid);
					empBean.setServiceName(empname);
					empBean.setPrice(empage);
					HouseKeepingDAO empDao = new HouseKeepingDAO();
					log.debug("call to House Keeping dao");
					int Status = empDao.updateDetails(empBean);
					request.setAttribute("msg", "Successfully Updated the Service " + empid);
					request.getRequestDispatcher("/HomePageAdmin.jsp").forward(request, response);
					log.info("Selected services are updated by customer");
				}

				else {
					System.out.println("error");
					response.sendRedirect("/ServicesUpdateDelete.jsp");

				}
			}

			if (request.getParameter("page").equalsIgnoreCase("deleteAdmin")) {
				String[] select = request.getParameterValues("check");

				if (select != null) {

					for (String s : select) {
						System.out.println(s);
						System.out.println(Integer.parseInt(s));
						int serviceID = Integer.parseInt(s);
						HouseKeepingBean bn = new HouseKeepingBean();
						// bn.setAmount(amount);
						// bn.setPrice(price);
						bn.setServiceID(serviceID);
						HouseKeepingDAO d = new HouseKeepingDAO();
						log.debug("call to House Keeping dao");

						int Status = d.DeleteAdmin(bn);
						if (Status == 1) {
							request.setAttribute("msg", "Successfully Deleted the Service " + serviceID);
						} else {
							request.setAttribute("msg", "The Service " + serviceID
									+ " is already used by the Customers. So it Cannot be deleted");
						}

						request.getRequestDispatcher("/HomePageAdmin.jsp").forward(request, response);
						log.info("Selected services are deleted by customer");

					}
				}
				// int requestID=
				// Integer.parseInt(request.getParameter("requestid"));

			}

			if (request.getParameter("page").equalsIgnoreCase("BillGen")) {

				String customerID = (request.getParameter("customerID"));

				int requestID = Integer.parseInt(request.getParameter("requestID"));
				int advanceAmount = Integer.parseInt(request.getParameter("advanceAmount"));
				int servicesCharge = Integer.parseInt(request.getParameter("servicesCharge"));
				int roomCharge = Integer.parseInt(request.getParameter("roomCharge"));
				int paidAmount = Integer.parseInt(request.getParameter("paidAmount"));
				int lodgingCharge = Integer.parseInt(request.getParameter("lodgingCharge"));
				int NoOfDays = Integer.parseInt(request.getParameter("NoOfDays"));
				int noOfRooms = Integer.parseInt(request.getParameter("noOfRooms"));
				String mode = request.getParameter("mode");
				String customerName = request.getParameter("customerName");
				String date = request.getParameter("dates");
				String type = request.getParameter("roomType");
				String ac = request.getParameter("AC");
				BillBean bn = new BillBean();

				bn.setCustomerID(customerID);
				bn.setRequestID(requestID);
				bn.setAC(ac);
				bn.setRoomType(type);
				bn.setAdvance(advanceAmount);
				bn.setServicesCharge(servicesCharge);
				bn.setRoomCharge(roomCharge);
				bn.setTotalAmount(paidAmount);
				bn.setLodgingCharge(lodgingCharge);
				bn.setDays(NoOfDays);
				bn.setNoOfRooms(noOfRooms);
				bn.setMode(mode);
				bn.setCustomerName(customerName);
				bn.setBill_date(date);
				BillDao d = new BillDao();
				log.debug("call to Bill dao");
				BillBean bean = d.GenBill(bn);
				request.setAttribute("beanObj", bean);
				request.getRequestDispatcher("/BillReceiptClerkForm.jsp").forward(request, response);
				log.info("Bill details are generated");
			}

			if (request.getParameter("page").equalsIgnoreCase("BillDelete")) {
				String[] select = request.getParameterValues("check");

				if (select != null) {
					for (String s : select) {
						System.out.println(s);
						System.out.println(Integer.parseInt(s));
						int BillNo = Integer.parseInt(s);
						BillDao d = new BillDao();
						log.debug("call to Bill dao");

						d.BillDelete(BillNo);
						request.setAttribute("msg", "Sucessfully deleted the Bills");
						log.info("Bill details are deleted");

					}
				} else {
					request.setAttribute("msg", "No Bills Found");

				}

				request.getRequestDispatcher("/HomePageClerk.jsp").forward(request, response);

				// int requestID=
				// Integer.parseInt(request.getParameter("requestid"));

			}

			if (request.getParameter("page").equalsIgnoreCase("insertFb")) {
				Feedbackbean bean = new Feedbackbean();

				String Cust_Id = (request.getParameter("customerID"));
				bean.setCust_Id(Cust_Id);
				int Request_Id = Integer.parseInt(request.getParameter("requestID"));
				bean.setRequest_Id(Request_Id);

				String name = request.getParameter("customerName");
				bean.setName(name);
				String Likes = request.getParameter("likes");
				bean.setLikes(Likes);
				String Dislikes = request.getParameter("dislikes");
				bean.setDislikes(Dislikes);
				int Rating = Integer.parseInt(request.getParameter("rating"));
				bean.setRating(Rating);
				String Comments = request.getParameter("comments");
				bean.setComments(Comments);
				FeedbackDao d = new FeedbackDao();
				log.debug("call to FeedBack dao");
				int status = d.insert(bean);
				request.setAttribute("msg", "Feedback is  Successfully submitted");
				request.getRequestDispatcher("/HomePageCustomer.jsp").forward(request, response);
				log.info("Feedback is  Successfully submitted");
			}
			if (request.getParameter("page").equalsIgnoreCase("updateFb")) {
				Feedbackbean bean = new Feedbackbean();

				String Cust_Id = (request.getParameter("customerID"));
				bean.setCust_Id(Cust_Id);
				int Request_Id = Integer.parseInt(request.getParameter("requestID"));
				bean.setRequest_Id(Request_Id);

				String name = request.getParameter("customerName");
				bean.setName(name);
				String Likes = request.getParameter("likes");
				bean.setLikes(Likes);
				String Dislikes = request.getParameter("dislikes");
				bean.setDislikes(Dislikes);
				int Rating = Integer.parseInt(request.getParameter("rating"));
				bean.setRating(Rating);
				String Comments = request.getParameter("comments");
				bean.setComments(Comments);
				FeedbackDao d = new FeedbackDao();
				log.debug("call to FeedBack dao");
				int status = d.update(bean);
				request.setAttribute("msg", "Feedback is  Successfully Updated");
				request.getRequestDispatcher("/HomePageCustomer.jsp").forward(request, response);
				log.info("Feedback is  Successfully updated");
			}

			/*
			 * if(request.getParameter("page").equalsIgnoreCase("selectFb")){ Feedbackbean
			 * bean=new Feedbackbean(); FeedbackService service=new FeedbackService();
			 * System.out.println("In servlet"); int
			 * Cust_Id=Integer.parseInt(request.getParameter("Cust_Id"));
			 * bean.setCust_Id(Cust_Id); service.select(bean); request.setAttribute("data",
			 * bean); System.out.println("Before completing servlet"); RequestDispatcher
			 * dis=request.getRequestDispatcher("view1.jsp"); dis.forward(request,
			 * response);
			 * 
			 * }
			 */
			if (request.getParameter("page").equalsIgnoreCase("viewallFb")) {
				Feedbackbean bean = new Feedbackbean();
				FeedbackDao service = new FeedbackDao();
				log.debug("call to FeedBack dao");

				ArrayList<Feedbackbean> arr = new ArrayList<Feedbackbean>();
				try {
					arr = service.viewAll();
				} catch (Exception e) {

					e.printStackTrace();
				}
				request.setAttribute("data", arr);
				RequestDispatcher dis = request.getRequestDispatcher("admin view.jsp");
				dis.forward(request, response);
				log.info("Feedback is  viewed by Admin");
			}

			if (request.getParameter("page").equalsIgnoreCase("insertComp")) {
				Complaintbean bean1 = new Complaintbean();
				ComplaintDao dao = new ComplaintDao();
				log.debug("call to Complaint dao");
				String Cust_Id = (request.getParameter("customerID"));
				bean1.setCust_Id(Cust_Id);

				int Request_Id = Integer.parseInt(request.getParameter("requestID"));
				bean1.setRequest_Id(Request_Id);
				String Category = request.getParameter("category");
				bean1.setCategory(Category);

				String Subcategory = request.getParameter("subCat");
				bean1.setSubcategory(Subcategory);
				String Description = request.getParameter("description");
				bean1.setDescription(Description);
				dao.insert(bean1);
				request.setAttribute("msg", "Complaint is  Successfully submitted");
				request.getRequestDispatcher("/HomePageCustomer.jsp").forward(request, response);
				log.info("Complaint is  Successfully submitted");

			}
			if (request.getParameter("page").equalsIgnoreCase("updateComp")) {
				Complaintbean bean1 = new Complaintbean();
				ComplaintDao dao = new ComplaintDao();
				log.debug("call to Complaint dao");
				String Cust_Id = (request.getParameter("customerID"));
				bean1.setCust_Id(Cust_Id);

				int Request_Id = Integer.parseInt(request.getParameter("requestID"));
				bean1.setRequest_Id(Request_Id);
				String Category = request.getParameter("category");
				bean1.setCategory(Category);

				String Subcategory = request.getParameter("subCat");
				bean1.setSubcategory(Subcategory);
				String Description = request.getParameter("description");
				bean1.setDescription(Description);
				dao.update(bean1);
				request.setAttribute("msg", "Complaint is  Successfully Updated");
				request.getRequestDispatcher("/HomePageCustomer.jsp").forward(request, response);
				log.info("Complaint is  Successfully Updated");
			}
			if (request.getParameter("page").equalsIgnoreCase("DeSelect")) {
				String[] select = request.getParameterValues("check");

				if (select != null) {

					for (String s : select) {
						System.out.println("Hi");
						System.out.println(s);
						System.out.println(Integer.parseInt(s));

						String CustomerID = (request.getParameter("customerid"));
						int requestID = Integer.parseInt(request.getParameter("requestid"));
						int serviceID = Integer.parseInt(s);

						// int price=
						// Integer.parseInt(request.getParameter("price".concat(s)));
						// int amount= days*price;

						HouseKeepingBean bn = new HouseKeepingBean();
						// bn.setAmount(amount);
						// bn.setPrice(price);
						bn.setCustomerID(CustomerID);
						bn.setServiceID(serviceID);
						bn.setRequestId(requestID);
						HouseKeepingDAO d = new HouseKeepingDAO();
						log.debug("call to House Keeping dao");
						int status = d.Deselect(bn);
					}
					request.setAttribute("msg", "Services are Successfully Cancelled");
					request.getRequestDispatcher("/HomePageCustomer.jsp").forward(request, response);

					log.info("Services are Successfully Cancelled");
				}

			}

			if (request.getParameter("page").equalsIgnoreCase("BillViewCust")) {
				request.getRequestDispatcher("/HomePageCustomer.jsp").forward(request, response);
			}
			if (request.getParameter("page").equalsIgnoreCase("FbViewCust")) {
				request.getRequestDispatcher("/HomePageCustomer.jsp").forward(request, response);
			}
			if (request.getParameter("page").equalsIgnoreCase("viewCompCust")) {
				request.getRequestDispatcher("/HomePageCustomer.jsp").forward(request, response);
			}
			if (request.getParameter("page").equalsIgnoreCase("viewAdminService")) {
				request.getRequestDispatcher("/HomePageAdmin.jsp").forward(request, response);
			}
			if (request.getParameter("page").equalsIgnoreCase("BillGenClerk")) {
				request.setAttribute("msg", "Sucessfully Generated the Bill");
				request.getRequestDispatcher("/HomePageClerk.jsp").forward(request, response);
			}
			if (request.getParameter("page").equalsIgnoreCase("BillViewClerk")) {

				request.getRequestDispatcher("/HomePageClerk.jsp").forward(request, response);
			}
			if (request.getParameter("page").equalsIgnoreCase("BillViewAdmin")) {
				request.getRequestDispatcher("/HomePageAdmin.jsp").forward(request, response);
			}
			if (request.getParameter("page").equalsIgnoreCase("viewCompAdmin")) {
				request.getRequestDispatcher("/HomePageAdmin.jsp").forward(request, response);
			}
			if (request.getParameter("page").equalsIgnoreCase("viewFbAdmin")) {
				request.getRequestDispatcher("/HomePageAdmin.jsp").forward(request, response);
			}
			if (request.getParameter("page").equalsIgnoreCase("adminview")) {
				BillBean billBean = new BillBean();
				BillDao Billobj = new BillDao();
				log.debug("call to Bill dao");
				billBean.setBill_date(request.getParameter("cindate"));

				ArrayList<BillBean> BillList = new ArrayList<BillBean>();
				BillList = Billobj.viewAdminBill(billBean);

				request.setAttribute("value", BillList);
				request.getRequestDispatcher("/adminbilldisplay.jsp").forward(request, response);
				log.info("Bill Details are Viewed by Admin");
			}

		} catch (Exception e) {
			e.printStackTrace();
			log.error("exception:", e);
		} finally {
		}

	}

}
