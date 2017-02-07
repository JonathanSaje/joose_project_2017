#Categories for testing - Joose Lab 2017
#
#This specification is designed to test addItem in the invmgt package 
#This is the first revision of the exercise
#
#

# Input item - Item
Environments:
  Item configuration:
     Complete item.							
	 Incomplete item.						[error]
  Supplier configuration:
	 Has items.								[property hasitems]
     No items.								[if !hasitems]
	 Has two items with matching names.		[if hasitems] [error]

	

# Input long - barcode
  Size:
     Empty.									[property emptybarcode]	[error]			
	 Not empty.
	 
  Presence of characters:
     None.									[if !emptybarcode]
	 Characters.							[if !emptybarcode] [property charbarcode] [error]
  
  Value:
     More than 99 less than 9999.			[if !emptybarcode && !charbarcode] [property correctbarcode]
	 <99.									[if !emptybarcode && !charbarcode && !correctbarcode] [error]
	 >9999.									[if !emptybarcode && !charbarcode && !correctbarcode] [error]
			


# Input String - itemName
  Length:
     Empty.									[property emptyname] [error]
	 Not empty.

  Content:
	 No special characters.					[if !emptyname] [property nocharsitem]
     None.									[if !emptyname && !nocharsitem] [error]
     Special characters.					[if !emptyname && !nocharsitem] [error]
	 



# Input String - itemType	 
  Length:
     Empty.									[property emptytype] [error]
	 Not empty.								[if !emptytype]



# Input int - qty
  Size:
     Empty.									[property emptyqty] [error]
	 Not empty.								[if emptyqty]
		 
  Presence of characters:
	None.									[if !emptyqty]
	Characters.								[if !emptyqty] [property charqty] [error]
	 
  Value:
	More than or equal to 0 less than 100.  [if !emptyqty && !charqty] [property correctqty]
    0.										[if !emptyqty && !charqty && !correctqty]
	<0.										[if !emptyqty && !charqty && !correctqty] [error]	
	>100.									[if !emptyqty && !charqty && !correctqty] [error]





# Input String - supplier
  Length:
     Empty.									[property emptysupplier] [error]
	 Not empty.
	 
  Content:
	 No special characters.					[if !emptysupplier] [property correctsupplier]
     None.									[if !emptysupplier && !correctsupplier] [error] 
	 Special characters.					[if !emptysupplier && !correctsupplier] [error]
	 
