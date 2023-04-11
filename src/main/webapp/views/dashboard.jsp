<%@include file="includes/header.jsp"%>

<div class="container text-center">
	<div class="row">
		<div class="col-sm-12">
			<a href="https://blackcoffer.com/"><img class="brand-logo"
				src="<c:url value="/assets/images/brand-logo.png" />"
				alt="brand-url" /></a>
		</div>
	</div>
</div>

<div class="container">
	<div class="row">
		<div class="col-sm-12">
			<div class="card filter-round-border">
				<div class="card-header">
					<i class="fa fa-filter"></i> Data filters
				</div>
				<div class="card-body">
					<div class="row">
						<div class="form-group col-sm-3">
							<div class="input-group" title="Start year filter goes here">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-calendar"></i></span>
								</div>
								<input type="text" name="startYear" id="startYear"
									class="form-control" placeholder="start year">
							</div>
						</div>
						
						<div class="form-group col-sm-3">
							<div class="input-group" title="End year filter goes here">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-calendar"></i></span>
								</div>
								<input type="text" name="endYear" id="endYear"
									class="form-control" placeholder="end year">
							</div>
						</div>

						<div class="form-group col-sm-3">
							<div class="input-group" title="Topic filter goes here">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-th"></i></span>
								</div>
								<input type="text" name="topic" id="topic" class="form-control"
									placeholder="topic">
							</div>
						</div>

						<div class="form-group col-sm-3">
							<div class="input-group" title="Sector filter goes here">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-sitemap"></i></span>
								</div>
								<input type="text" name="sector" id="sector"
									class="form-control" placeholder="sector">
							</div>
						</div>

						<div class="form-group col-sm-3">
							<div class="input-group" title="Region filter goes here">
								<div class="input-group-prepend">
									<span class="input-group-text"><i
										class="fa fa-location-arrow"></i></span>
								</div>
								<input type="text" name="region" id="region"
									class="form-control" placeholder="region">
							</div>
						</div>

						<div class="form-group col-sm-3">
							<div class="input-group" title="Pestle filter goes here">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-star"></i></span>
								</div>
								<input type="text" name="pestle" id="pestle"
									class="form-control" placeholder="pestle">
							</div>
						</div>

						<div class="form-group col-sm-3">
							<div class="input-group" title="Source filter goes here">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-ship"></i></span>
								</div>
								<input type="text" name="source" id="source"
									class="form-control" placeholder="source">
							</div>
						</div>

						<div class="form-group col-sm-3">
							<div class="input-group" title="SWOT filter goes here">
								<div class="input-group-prepend">
									<span class="input-group-text"><i
										class="fa fa-question-circle"></i></span>
								</div>
								<select name="swot" id="swot" class="form-control">

								</select>
							</div>
						</div>

						<div class="form-group col-sm-3">
							<div class="input-group" title="Country filter goes here">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-globe"></i></span>
								</div>
								<select name="country" id="country" class="form-control">

								</select>
							</div>
						</div>

						<div class="form-group col-sm-3">
							<div class="input-group" title="City filter goes here">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-building"></i></span>
								</div>
								<input type="text" name="city" id="city" class="form-control"
									placeholder="city">
							</div>
						</div>
						
						<div class="form-group col-sm-3">
							<div class="input-group" title="Choose dashboard view type">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-dashboard"></i></span>
								</div>
								<select name="dashboardType" id="dashboardType" class="form-control">
									<option value="datatable">DataTable</option>
									<option value="chart">Chart</option>
								</select>
							</div>
						</div>

						<div class="form-group col-sm-3 action-not-allowed-fade" id="chartTypeDiv">
							<div class="input-group" title="Choose chart type">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-pie-chart"></i></span>
								</div>
								<select name="chartType" id="chartType" class="form-control action-not-allowed">
									<option value="barChart">Bar Chart</option>
									<option value="doughnutChart">Doughnut Chart</option>
									<option value="pieChart">Pie Chart</option>
									<option value="lineChart">Line Chart</option>
									<option value="polarChart">Polar Chart</option>
									<option value="radarChart">Radar Chart</option>
								</select>
							</div>
						</div>
						
						<div class="form-group col-sm-3 action-not-allowed-fade" id="chartDataColumnDiv">
							<div class="input-group" title="Choose chart representation based on which field">
								<div class="input-group-prepend">
									<span class="input-group-text"><i class="fa fa-columns"></i></span>
								</div>
								<select name="chartDataColumn" id="chartDataColumn" class="form-control action-not-allowed">
									<option value="swot">SWOT</option>
									<option value="topic">Topic</option>
									<option value="sector">Sector</option>
									<option value="region">Region</option>
									<option value="city">City</option>
									<option value="country">Country</option>
									<option value="pestle">Pest</option>
									<option value="source">Source</option>									
								</select>
							</div>
						</div>

						<div class="form-group col-sm-9">
							<button class="btn btn-primary  float-right" id="applyFilter">Apply</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<hr/>



<div class="container d-none" id="chartDashboard">
	<div class="row">
		<div class="col-sm-12">
			<canvas id="myChart"></canvas>
		</div>
	</div>
</div>


<div class="container" id="dataTableDashboard">
	<div class="row">
		<div class="col-sm-12">
			<table id="dashboardTable" class="table table-striped table-bordered dt-responsive" style="width:100%">
		        <thead>
		        	<tr>
		        		<th>Id</th>
		        		<th>End Year</th>
		        		<th>City Lng</th>
		        		<th>City Log</th>
		        		<th>Intensity</th>
		        		<th>Sector</th>
		        		<th>Topic</th>
		        		<th>Insight</th>
		        		<th>SWOT</th>
		        		<th>URL</th>
		        		<th>Region</th>
		        		<th>Start Year</th>
		        		<th>Impact</th>
		        		<th>Added</th>
		        		<th>Published</th>
		        		<th>City</th>
		        		<th>Country</th>
		        		<th>Relevance</th>
		        		<th>Pestle</th>
		        		<th>Source</th>
		        		<th>Title</th>
		        		<th>Likelihood</th>
	        		</tr>
		        </thead>
		    </table>
			    
		</div>
	</div>
</div>


<div class="container text-center">
	<div class="row">
		<div class="col-sm-12">
			<small> Assignment submitted by <a target="_blank"
				href="https://github.com/gauravnewton/">Gaurav Kumar</a></small>
		</div>
	</div>
</div>


<%@include file="includes/footer.jsp"%>

<script>
var dashboardTable;
var ctx = document.getElementById('myChart');

$(document).ready(function() {
	var loadDefaultDashboard = function() {
		var options = {
		     theme:"sk-rect",
		     message:'Loading default dashboard data...',
		     textColor:"white"
		};
			
		openLoader(options);
		
		$.ajax({
			url: "../app/getDefaultDashboard",
			type: 'GET',
			crossDomain: true,
			dataType: 'json',
			contentType: 'application/json',
			success: function(response) {
				if(response && response.statusCode == "OK"){
					closeLoader();
					renderDataTable(response.data);
				}else{				
					closeLoader();
					jNotify.error('Error','Something went wrong !',{
						delay: 2500,
						fadeDelay: 1000,
						closeButton: false,
						titleBold: true,
						offset: 40
					});
				}
			},
			error: function(data, textStatus, errorMessage) {
				closeLoader();
				jNotify.error('Error','Something went wrong',{
					delay: 2500,
					fadeDelay: 1000,
					closeButton: false,
					titleBold: true,
					offset: 40
				});

			}
		});
	}
	
	var renderDataTable = function(response){
		
		if( dashboardTable ){
			dashboardTable.fnClearTable();
			dashboardTable.fnDestroy();
		}
		  
		dashboardTable = $("#dashboardTable").dataTable({
	        "aaData" : response,
	        "autoWidth": true, 
	        "paging": true,
	        "sortable": true,
	        "aoColumns" : [
	            
	            {
	                mData: 'id',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'endYear',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'cityLng',
	                sClass: 'text-center vertically-align'
	            },

	            {
	                mData: 'cityLat',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'intensity',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'sector',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'topic',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'insight',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'swot',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'url',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'region',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'startYear',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'impact',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'added',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'published',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'city',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'country',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'relevance',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'pestle',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'source',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'title',
	                sClass: 'text-center vertically-align'
	            },
	            {
	                mData: 'likeliHood',
	                sClass: 'text-center vertically-align'
	            }
	        ],
	        "aoColumnDefs" : [
	        	 {
	                "aTargets" : [ 1 ],
	                "mRender" : function(d, t, r){
	                    return sanatizeData(d);
	                }
		                
	            },
	            {
	                "aTargets" : [ 2 ],
	                "mRender" : function(d, t, r){
	                    return sanatizeData(d);
	                }
	                
            	},
            	{
	                "aTargets" : [ 3 ],
	                "mRender" : function(d, t, r){
	                    return sanatizeData(d);
	                }
	                
	            },
	            {
	                "aTargets" : [ 4 ],
	                "mRender" : function(d, t, r){
	                    return sanatizeData(d);
	                }
	                
	        	},
	        	{
	                "aTargets" : [ 5 ],
	                "mRender" : function(d, t, r){
	                    return sanatizeData(d);
	                }
	                
	            },
	            {
	                "aTargets" : [ 6 ],
	                "mRender" : function(d, t, r){
	                    return sanatizeData(d);
	                }
	                
	        	},
	        	{
	                "aTargets" : [ 7 ],
	                "mRender" : function(d, t, r){
	                    return sanatizeData(d);
	                }
	                
		        },
		        {
		            "aTargets" : [ 8 ],
		            "mRender" : function(d, t, r){
		                return sanatizeData(d);
		            }
		            
		    	},
		    	{
		            "aTargets" : [ 9 ],
		            "mRender" : function(d, t, r){
		                return sanatizeData(d);
		            }
		            
			    },
			    {
			        "aTargets" : [ 10 ],
			        "mRender" : function(d, t, r){
			            return sanatizeData(d);
			        }
			        
				},
				{
			        "aTargets" : [ 11 ],
			        "mRender" : function(d, t, r){
			            return sanatizeData(d);
			        }
			        
				},
				{
				    "aTargets" : [ 12 ],
				    "mRender" : function(d, t, r){
				        return sanatizeData(d);
				    }
				    
				},
				{
				    "aTargets" : [ 13],
				    "mRender" : function(d, t, r){
				        return sanatizeData(d);
				    }
				    
				},
				{
					"aTargets" : [ 14 ],
					"mRender" : function(d, t, r){
					    return sanatizeData(d);
					}
				
				},
				{
				    "aTargets" : [ 15 ],
				    "mRender" : function(d, t, r){
				        return sanatizeData(d);
				    }
				    
				},
					{
					"aTargets" : [ 16 ],
					"mRender" : function(d, t, r){
					    return sanatizeData(d);
					}
				
				},
				{
				    "aTargets" : [ 17 ],
				    "mRender" : function(d, t, r){
				        return sanatizeData(d);
				    }
				    
				},
				{
					"aTargets" : [ 18 ],
					"mRender" : function(d, t, r){
					    return sanatizeData(d);
					}
				
				},
				{
				    "aTargets" : [ 19 ],
				    "mRender" : function(d, t, r){
				        return sanatizeData(d);
				    }
				    
				},
				{
					"aTargets" : [ 20 ],
					"mRender" : function(d, t, r){
					    return sanatizeData(d);
					}
				
				},
				{
				    "aTargets" : [ 21 ],
				    "mRender" : function(d, t, r){
				        return sanatizeData(d);
				    }
				    
				}
	        ]
	        
	    });
	}

	
	$('#dashboardType').on('change', function() {
		if($('#dashboardType').val() == 'chart') {
			$('#chartTypeDiv').removeClass('action-not-allowed-fade');
			$('#chartType').removeClass('action-not-allowed');
			
			$('#chartDataColumnDiv').removeClass('action-not-allowed-fade');
			$('#chartDataColumn').removeClass('action-not-allowed');
			
			
		} else {
			$('#chartTypeDiv').addClass('action-not-allowed-fade');
			$('#chartType').addClass('action-not-allowed');	
			
			$('#chartDataColumnDiv').addClass('action-not-allowed-fade');
			$('#chartDataColumn').addClass('action-not-allowed');
		}
	})


	var prepareFilters = function() {
		return {
			"startYear" : $('#startYear').val(),
			"endYear" : $('#endYear').val(),
			"topic" : $('#topic').val(),
			"sector" : $('#sector').val(),
			"region" : $('#region').val(),
			"pestle" : $('#pestle').val(),
			"source" : $('#source').val(),
			"swot" : $('#swot').val(),
			"country" : $('#country').val(),
			"city" : $('#city').val(),
			"dashboardType" : $('#dashboardType').val(),
			"chartType" : $('#chartType').val(),
			"chartRepresentationField" : $('#chartDataColumn').val()
		};
	}
	
	var renderChart = function(chartType, data) {
	  if (Chart.getChart('myChart')) {
		  Chart.getChart('myChart').destroy();
	  }
	  
	  var labelArray = [];
	  var dataArray = [];
	  $(data).each(function(key, value) {
		  labelArray.push(value.filterParam);
		  dataArray.push(value.count);
	  })

	  new Chart(ctx, {
	    type: chartType,
	    data: {
	      labels: labelArray,
	      datasets: [{
	        label: '',
	        data: dataArray,
	        borderWidth: 1
	      }]
	    },
	    options: {
	      scales: {
	        y: {
	          beginAtZero: true
	        }
	      }
	    }
	  });	
	}
	
	var applyFilerToChart = function(filters) {
		$.ajax({
			url: "../app/applyChartFilters",
			type: 'POST',
			crossDomain: true,
			data: JSON.stringify(filters),
			dataType: 'json',
			contentType: 'application/json',
			success: function(response) {
				if(response && response.statusCode == "OK"){
					closeLoader();
					switch( $('#chartType').val() ) {
						case 'barChart' :
							renderChart('bar', response.data);
							break;
						case 'doughnutChart' :
							renderChart('doughnut', response.data);
							break;
						case 'pieChart' :
							renderChart('pie', response.data);
							break;
						case 'lineChart' :
							renderChart('line', response.data);
							break;
						case 'polarChart' :
							renderChart('polarArea', response.data);
							break;
						case 'radarChart' :
							renderChart('radar', response.data);
							break;
					}
					var option = {
							title: 'Success',
							delay: 2500,
							fadedelay: 1000,
							closeBtn: false,
							bold: true,
							offset: 40,
							message: 'Filter applied !'
					}
					notify(option);
				}else{				
					closeLoader();
					jNotify.error('Error','Something went wrong !',{
						delay: 2500,
						fadeDelay: 1000,
						closeButton: false,
						titleBold: true,
						offset: 40
					});
				}
			},
			error: function(data, textStatus, errorMessage) {
				closeLoader();
				jNotify.error('Error','Something went wrong',{
					delay: 2500,
					fadeDelay: 1000,
					closeButton: false,
					titleBold: true,
					offset: 40
				});

			}
		});
	}

	var applyFilerToDataTable = function (filters) {
		$.ajax({
			url: "../app/applyDataTableFilters",
			type: 'POST',
			crossDomain: true,
			data: JSON.stringify(filters),
			dataType: 'json',
			contentType: 'application/json',
			success: function(response) {
				if(response && response.statusCode == "OK"){
					closeLoader();
					renderDataTable(response.data);
					var option = {
							title: 'Success',
							delay: 2500,
							fadedelay: 1000,
							closeBtn: false,
							bold: true,
							offset: 40,
							message: 'Filter applied !'
					}
					notify(option);
				}else{				
					closeLoader();
					jNotify.error('Error','Something went wrong !',{
						delay: 2500,
						fadeDelay: 1000,
						closeButton: false,
						titleBold: true,
						offset: 40
					});
				}
			},
			error: function(data, textStatus, errorMessage) {
				closeLoader();
				jNotify.error('Error','Something went wrong',{
					delay: 2500,
					fadeDelay: 1000,
					closeButton: false,
					titleBold: true,
					offset: 40
				});

			}
		});
	}
	

	var sanatizeData = function(data) {
		if( data == null || data == 0 || data == '') {
			return '-';
		} else {
			return data;
		}
	}
	


	$('#applyFilter').on('click', function(){
		var options = {
		     theme:"sk-rect",
		     message:'Applying filter(s)...',
		     textColor:"white"
		};
			
		openLoader(options);
		var filters = prepareFilters();

		if( $('#dashboardType').val() == 'chart') {
			$('#dataTableDashboard').addClass('d-none');
			$('#chartDashboard').removeClass('d-none');
			applyFilerToChart(filters);
		} else {
			$('#chartDashboard').addClass('d-none');
			$('#dataTableDashboard').removeClass('d-none');
			applyFilerToDataTable(filters);
		}
		
	})

	var loadMetaDataForSWOTFilter = function(){
			
		var options = {
		     theme:"sk-rect",
		     message:'Fetching SWOT meta data for filter...',
		     textColor:"white"
		};
			
		openLoader(options);
			
		$.ajax({
			url: "../app/getMetaDataForSWOTFilter",
			type: 'GET',
			crossDomain: true,
			dataType: 'json',
			contentType: 'application/json',
			success: function(response) {
				if(response && response.statusCode == "OK"){
					closeLoader();
					var html = ``;
					$(response.data).each(function(key, value) {
						html += `
							<option value="`+value+`">`+value+`</option>
						`;
					})
					$('#swot').html(html);
					loadMetaDataForCountryFilter();
				}else{				
					closeLoader();
					jNotify.error('Error','Something went wrong !',{
						delay: 2500,
						fadeDelay: 1000,
						closeButton: false,
						titleBold: true,
						offset: 40
					});
				}
			},
			error: function(data, textStatus, errorMessage) {
				closeLoader();
				jNotify.error('Error','Something went wrong',{
					delay: 2500,
					fadeDelay: 1000,
					closeButton: false,
					titleBold: true,
					offset: 40
				});

			}
		});
	}

	var loadMetaDataForCountryFilter = function(){
		
		var options = {
		     theme:"sk-rect",
		     message:'Fetching country meta data for filter...',
		     textColor:"white"
		};
			
		openLoader(options);
			
		$.ajax({
			url: "../app/getMetaDataForCountryFilter",
			type: 'GET',
			crossDomain: true,
			dataType: 'json',
			contentType: 'application/json',
			success: function(response) {
				if(response && response.statusCode == "OK"){
					closeLoader();
					var html = ``;
					$(response.data).each(function(key, value) {
						html += `
							<option value="`+value+`">`+value+`</option>
						`;
					})
					$('#country').html(html);
				}else{				
					closeLoader();
					jNotify.error('Error','Something went wrong !',{
						delay: 2500,
						fadeDelay: 1000,
						closeButton: false,
						titleBold: true,
						offset: 40
					});
				}
			},
			error: function(data, textStatus, errorMessage) {
				closeLoader();
				jNotify.error('Error','Something went wrong',{
					delay: 2500,
					fadeDelay: 1000,
					closeButton: false,
					titleBold: true,
					offset: 40
				});

			}
		});
	}
	

	loadMetaDataForSWOTFilter();
	loadDefaultDashboard();
});

</script>