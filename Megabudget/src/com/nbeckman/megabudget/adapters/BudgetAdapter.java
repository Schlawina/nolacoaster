package com.nbeckman.megabudget.adapters;

import java.util.List;

import com.google.gdata.data.spreadsheet.CellEntry;

// BudgetAdapter is the one planned source for expansion in this
// application. Understanding that most other people may not use
// the exact spreadsheet formatting as I do, implementations of
// this interface are how the application can get from a variety
// of budget spreadsheet formats into an interface that the application
// can work with, essentially allowing it to display names of
// budget months and categories, and to get spreadsheet cells where
// the totals for those months and categories are located.
public interface BudgetAdapter {
	// Return all of the available months, in an
	// order suitable for display.
	public List<BudgetMonth> getMonths();
	
	// Return all of the available categories in an
	// order suitable for display.
	public List<BudgetCategory> getCategories();
	
	// For a given month and budget category, return the
	// spreadsheet cell where the current value can be
	// found.
	public CellEntry getCell(BudgetMonth month, BudgetCategory category);
	
	// For a given month, returns the spreadsheet cell for
	// that month's total.
	public CellEntry getMonthTotalCell(BudgetMonth month);
}
